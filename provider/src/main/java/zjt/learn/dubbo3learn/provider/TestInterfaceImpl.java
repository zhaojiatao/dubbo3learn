package zjt.learn.dubbo3learn.provider;

import org.apache.dubbo.config.annotation.DubboService;
import zjt.learn.dubbo3learn.api.TestInterface;

/**
 * 功能：
 *
 * @Author: zhaojiatao
 * @Date: 2022/7/19 9:42
 * @ClassName: TestInterfaceImpl
 */
@DubboService
public class TestInterfaceImpl implements TestInterface {
    @Override
    public String hello(String param) {
        return "返回:"+param;
    }
}
