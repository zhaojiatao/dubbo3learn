package zjt.learn.dubbo3learn.consumer.filter;

import com.alibaba.dubbo.rpc.RpcContext;
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
 * @Author: lfyang
 * @Date: 2022/7/6 17:03
 */
@Activate(group = {CommonConstants.CONSUMER})
@Slf4j
public class SecurityConsumerFilter implements Filter {
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        log.info("接口名称{}，参数{}",invocation.getAttachments().get("path"), JSON.toJSONString(invocation.getArguments()));
        RpcContext.getContext().setAttachment("loginUser","zhaojiatao");
        return invoker.invoke(invocation);
    }
}