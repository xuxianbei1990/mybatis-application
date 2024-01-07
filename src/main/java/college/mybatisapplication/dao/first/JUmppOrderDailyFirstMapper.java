package college.mybatisapplication.dao.first;


import college.mybatisapplication.entity.JUmppOrderDaily;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 日生产工单 Mapper 接口
 * </p>
 *
 * @author xuxianbei
 * @since 2023-12-23
 */

public interface JUmppOrderDailyFirstMapper extends BaseMapper<JUmppOrderDaily> {


    List<JUmppOrderDaily> selectAll();

}
