package zjt.learn.dubbo3learn.provider.test;

import com.ichint.b2b.plus.keel.api.flow.IFlowableQueryService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.Test;
import zjt.learn.dubbo3learn.provider.SpringTests;

/**
 * 功能：
 *
 * @Author: zhaojiatao
 * @Date: 2022/7/20 10:36
 * @ClassName: Mytest
 */
public class Mytest extends SpringTests {


    @DubboReference
    private IFlowableQueryService flowableQueryService;

    @Test
    public void test01(){
        String s = flowableQueryService.queryByTaskId("223323");
        System.out.println(s);
    }
}
