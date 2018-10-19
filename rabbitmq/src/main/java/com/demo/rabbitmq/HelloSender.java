package com.demo.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender {

    //rabbitTemplate是springboot 提供的默认实现
    @Autowired
    AmqpTemplate template;

    public void send(){
        String content = "hello rabbitmq";
        System.out.println("send:" + content);
        this.template.convertAndSend("hello",content);
    }
}
