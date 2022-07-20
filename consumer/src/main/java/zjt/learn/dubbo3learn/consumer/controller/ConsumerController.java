package zjt.learn.dubbo3learn.consumer.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import zjt.learn.dubbo3learn.api.TestInterface;
import zjt.learn.dubbo3learn.api.TestInterface2;

@Controller
public class ConsumerController {
    @DubboReference
    private TestInterface dubboInterface;

    @DubboReference
    private TestInterface2 dubboInterface2;

    @GetMapping("dubbo")
    @ResponseBody
    public String getFromProvider(){
        return dubboInterface.hello("dddaaaa");
    }

    @GetMapping("dubbo2")
    @ResponseBody
    public String getFromProvider2(){
        return dubboInterface2.hello2("dddaaaa2222");
    }
}
