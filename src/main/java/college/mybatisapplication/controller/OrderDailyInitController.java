package college.mybatisapplication.controller;

import college.mybatisapplication.context.ShareContext;
import college.mybatisapplication.dao.first.JUmppOrderDailyFirstMapper;
import college.mybatisapplication.entity.JUmppOrderDaily;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: Administrator
 * Date: 2024/1/6
 * Time: 11:01
 * Version:V1.0
 */
@RequestMapping("init")
@RestController
public class OrderDailyInitController {

    @Autowired
    private JUmppOrderDailyFirstMapper jUmppOrderDailyFirstMapper;

    @Autowired
    private ShareContext shareContext;


    @GetMapping("daily")
    public int initDaily() {
        List<JUmppOrderDaily> list = jUmppOrderDailyFirstMapper.selectList(Wrappers.lambdaQuery());
        shareContext.setList(list);
        return 1;
    }
}
