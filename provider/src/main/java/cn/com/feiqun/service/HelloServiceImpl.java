package cn.com.feiqun.service;

import cn.com.feiqun.HelloService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author feiqun
 * @date 2019/5/14 9:55
 * @desc
 */
@Component
@Service(interfaceClass = HelloService.class)
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "hello dubbo!";
    }
}
