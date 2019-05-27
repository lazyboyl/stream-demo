package com.stream.send.demo;

import com.stream.send.demo.config.SendProcess;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author linzf
 * @since 2019-05-27
 * 类描述：MQ的主入口类
 */
@SpringBootApplication
@EnableBinding(SendProcess.class)
public class SendMqDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SendMqDemoApplication.class, args);
    }

}
