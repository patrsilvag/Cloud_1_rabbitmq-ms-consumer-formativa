package com.example.rabbitmqconsumer.controllers;

import com.example.rabbitmqconsumer.models.MensajeRabbitMQ;
import com.example.rabbitmqconsumer.services.MensajeRabbitMQService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final MensajeRabbitMQService service;

    @PostMapping
    public MensajeRabbitMQ guardar() {
        return service.guardarMensaje("Mensaje de prueba Oracle");
    }
}
