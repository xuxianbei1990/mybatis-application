package college.mybatisapplication.controller;

import college.mybatisapplication.context.ShareContext;
import college.mybatisapplication.dao.second.JUmppOrderDailySecondMapper;
import college.mybatisapplication.entity.JUmppOrderDaily;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * User: Administrator
 * Date: 2024/1/6
 * Time: 11:13
 * Version:V1.0
 */
@RequestMapping("save")
@RestController
public class OrderDailySaveController {

    @Autowired
    private JUmppOrderDailySecondMapper jUmppOrderDailyMapper;

    @Autowired
    private ShareContext shareContext;

    @GetMapping("daily")
    @Transactional(rollbackFor = Exception.class)
    public int initDaily() {
        List<JUmppOrderDaily> orderDailies = shareContext.getList().stream().limit(10).collect(Collectors.toList());
        for (JUmppOrderDaily jUmppOrderDaily : orderDailies) {
            jUmppOrderDailyMapper.insert(jUmppOrderDaily);
        }
        return 1;
    }
}
