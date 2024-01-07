package college.mybatisapplication.dao.second;

import college.mybatisapplication.entity.JUmppOrderDaily;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 日生产工单 Mapper 接口
 * </p>
 *
 * @author xuxianbei
 * @since 2023-12-23
 */

public interface JUmppOrderDailySecondMapper extends BaseMapper<JUmppOrderDaily> {

    Integer insertOne(@Param("item") JUmppOrderDaily item);

}
