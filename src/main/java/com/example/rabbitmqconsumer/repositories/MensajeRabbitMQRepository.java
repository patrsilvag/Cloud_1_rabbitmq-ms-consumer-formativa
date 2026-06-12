package com.example.rabbitmqconsumer.repositories;

import com.example.rabbitmqconsumer.models.MensajeRabbitMQ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeRabbitMQRepository extends JpaRepository<MensajeRabbitMQ, Long> {
}
