package com.stream.receive.demo.receive;

import com.stream.receive.demo.config.ReceiveProcess;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;

/**
 * @author linzf
 * @since 2019-05-27
 * 类描述：接收者的接收类
 */
@EnableBinding(ReceiveProcess.class)
public class ReceiveMsg {

    /**
     * 接收所有的通道为sendOneReceiveAllChanel的消息
     * @param content
     */
    @StreamListener(target = "sendOneReceiveAllChanel" )
    public void consumer(Message<String> content){
        System.out.println("【sendOneReceiveAllChanel】接收到了消息："+content);
    }

    /**
     * 接收所有的通道为receiveHelloChanel的消息
     * @param content
     */
    @StreamListener(target = "receiveHelloChanel" )
    public void receiveHelloWorld(Message<String> content){
        System.out.println("【receiveHelloWorld】接收到了消息："+content);
    }

}
