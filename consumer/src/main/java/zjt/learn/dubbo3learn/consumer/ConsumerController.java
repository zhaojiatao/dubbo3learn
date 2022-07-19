package zjt.learn.dubbo3learn.consumer;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import zjt.learn.dubbo3learn.api.TestInterface;

@Controller
public class ConsumerController {
    @DubboReference
    TestInterface dubboInterface;
    
    @GetMapping("dubbo")
    @ResponseBody
    public String getFromProvider(){
        return dubboInterface.hello("dddaaaa");
    }
}
