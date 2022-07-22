package zjt.learn.dubbo3learn.provider.filter;

import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.Filter;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Result;

/**
 * 功能：
 *
 * @Author: zhaojiatao
 * @Date: 2022/7/22 14:36
 * @ClassName: SecurityConsumerFilter
 */
@Slf4j
@Activate(group = {CommonConstants.PROVIDER})
public class SecurityProviderFilter implements Filter {

    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        log.info("接口名称{}，参数{}",invocation.getAttachments().get("path"),JSON.toJSONString(invocation.getArguments()));
        log.info("loginUser={}，参数{}",invocation.getAttachments().get("loginUser"),JSON.toJSONString(invocation.getArguments()));
        Result result = invoker.invoke(invocation);
        return result;
    }
}
