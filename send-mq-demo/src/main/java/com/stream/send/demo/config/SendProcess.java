package com.stream.send.demo.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author linzf
 * @since 2019-05-27
 * @类描述： 发送的MQ的配置文件
 */
public interface SendProcess {

    /**
     * 创建一个发送sendOneReceiveAll的通道
     * @return 返回发送结果
     */
    @Output("sendOneReceiveAll")
    MessageChannel sendOneReceiveAll();

    /**
     * 创建一个发送sayHelloWorld的通道
     * @return 返回发送结果
     */
    @Output("sayHelloWorld")
    MessageChannel sayHelloWorld();


}
