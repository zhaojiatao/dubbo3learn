package zjt.learn.dubbo3learn.provider.impl;

import org.apache.dubbo.config.annotation.DubboService;
import zjt.learn.dubbo3learn.api.TestInterface2;

/**
 * 功能：
 *
 * @Author: zhaojiatao
 * @Date: 2022/7/20 22:03
 * @ClassName: TestInterface2Impl
 */
@DubboService
public class TestInterface2Impl implements TestInterface2 {
    @Override
    public String hello2(String param) {
        return "返回："+param;
    }
}
