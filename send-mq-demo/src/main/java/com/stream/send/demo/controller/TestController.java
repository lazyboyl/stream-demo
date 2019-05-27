package com.stream.send.demo.controller;

import com.stream.send.demo.config.SendProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linzf
 * @since 2019/5/27
 * 类描述：测试发送消息的controller类
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private SendProcess sendProcess;

    /**
     * 功能描述：实现发送我们的测试信息
     * @return
     */
    @GetMapping("send")
    public String send(){
        sendProcess.sendOneReceiveAll().send(MessageBuilder.withPayload("测试发送一条数据被所有的接收者接收的例子").setHeader("type", "foo").build());
        sendProcess.sayHelloWorld().send(MessageBuilder.withPayload("测试每次发送只会被一个接收者接收的例子").setHeader("type", "foo").build());
        return "发送成功";
    }

}
