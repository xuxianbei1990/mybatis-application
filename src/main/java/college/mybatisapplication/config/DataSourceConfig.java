package college.mybatisapplication.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * User: Administrator
 * Date: 2024/1/5
 * Time: 13:08
 * Version:V1.0
 */
@Configuration
public class DataSourceConfig {

    @Primary
    @Bean(name = "firstDataSource")
    @ConfigurationProperties("spring.datasource.druid.first")
    public DataSource first() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "secondDataSource")
    @ConfigurationProperties("spring.datasource.druid.second")
    public DataSource second() {
        return DruidDataSourceBuilder.create().build();
    }
}
