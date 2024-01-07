package college.mybatisapplication.config;

import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * User: Administrator
 * Date: 2024/1/5
 * Time: 13:19
 * Version:V1.0
 */
@Configuration
@MapperScan(basePackages = "college.mybatisapplication.dao.first", sqlSessionTemplateRef  = "firstSqlSessionTemplate")
public class DruidConfigFirst {

    @Bean(name = "firstSqlSessionFactory")
    @Primary
    public SqlSessionFactory sqlSessionFactory(@Qualifier("firstDataSource") DataSource dataSource) throws Exception {
        //把这行代码改为MybatisSqlSessionFactoryBean就可以兼容mybatis plus 但是 MybatisPlusAutoConfiguration 的 sqlSessionFactory 有差异
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        MybatisSqlSessionFactoryBean bean = new MybatisSqlSessionFactoryBean();

        bean.setDataSource(dataSource);
        PathMatchingResourcePatternResolver resourcePatternResolver =  new PathMatchingResourcePatternResolver();
        bean.setMapperLocations(resourcePatternResolver.getResources("classpath*:college/mybatisapplication/dao/first/*.xml"));
        return bean.getObject();
    }


    @Bean(name = "firstTransactionManager")
    @Primary
    public DataSourceTransactionManager transactionManager(@Qualifier("firstDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "firstSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("firstSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }




}
