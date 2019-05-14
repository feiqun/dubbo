package cn.com.feiqun.service;

import cn.com.feiqun.HelloService;
import com.alibaba.dubbo.config.annotation.Reference;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author feiqun
 * @date 2019/5/14 9:50
 * @desc
 */
@Controller
@Api
public class ConsumerController {

    @Reference
    HelloService helloService;

    @ApiOperation("hello")
    @GetMapping(value = "/api/hello")
    @ResponseBody
    public String hello() {
        return helloService.hello();
    }
}
