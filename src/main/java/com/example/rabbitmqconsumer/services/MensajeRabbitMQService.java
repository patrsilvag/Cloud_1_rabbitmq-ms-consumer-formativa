package com.example.rabbitmqconsumer.services;

import com.example.rabbitmqconsumer.models.MensajeRabbitMQ;
import com.example.rabbitmqconsumer.repositories.MensajeRabbitMQRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class MensajeRabbitMQService {

    private final MensajeRabbitMQRepository repository;

    public MensajeRabbitMQ guardarMensaje(String contenido) {

        MensajeRabbitMQ mensaje = MensajeRabbitMQ.builder().contenido(contenido).estado("RECIBIDO")
                .fechaRecepcion(LocalDateTime.now()).build();

        return repository.save(mensaje);
    }
}
