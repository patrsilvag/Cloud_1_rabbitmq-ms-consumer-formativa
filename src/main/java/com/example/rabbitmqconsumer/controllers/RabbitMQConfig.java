package com.example.rabbitmqconsumer.controllers;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue miCola() {
        return new Queue("micola", true);
    }
}
