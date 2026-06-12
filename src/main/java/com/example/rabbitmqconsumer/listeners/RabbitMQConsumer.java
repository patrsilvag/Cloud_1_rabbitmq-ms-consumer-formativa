package com.example.rabbitmqconsumer.listeners;

import com.example.rabbitmqconsumer.services.MensajeRabbitMQService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RabbitMQConsumer {

    private final MensajeRabbitMQService service;

    @RabbitListener(queues = "micola")
    public void recibirMensaje(String mensaje) {

        System.out.println("================================");
        System.out.println("MENSAJE RECIBIDO");
        System.out.println(mensaje);
        System.out.println("================================");

        service.guardarMensaje(mensaje);
    }
}
