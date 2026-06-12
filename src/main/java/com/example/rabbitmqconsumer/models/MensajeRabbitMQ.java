package com.example.rabbitmqconsumer.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "MENSAJES_RABBITMQ")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MensajeRabbitMQ {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 4000)
    private String contenido;

    private String estado;

    private LocalDateTime fechaRecepcion;
}
