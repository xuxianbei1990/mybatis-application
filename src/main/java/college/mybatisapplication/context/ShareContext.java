package college.mybatisapplication.context;

import college.mybatisapplication.entity.JUmppOrderDaily;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * User: Administrator
 * Date: 2024/1/6
 * Time: 11:10
 * Version:V1.0
 */
@Component
@Data
public class ShareContext {
    private List<JUmppOrderDaily> list;
}
