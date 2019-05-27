package com.stream.receive.demo.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author linzf
 * @since 2019-05-27
 * 类描述：接收者的配置
 */
public interface ReceiveProcess {

    /**
     * 接收sendOneReceiveAllChanel发送过来的消息
     * @return
     */
    @Input("sendOneReceiveAllChanel")
    SubscribableChannel sendOneReceiveAllChanel();

    /**
     * 接收receiveHelloChanel发送过来的消息
     * @return
     */
    @Input("receiveHelloChanel")
    SubscribableChannel receiveHelloChanel();

}
