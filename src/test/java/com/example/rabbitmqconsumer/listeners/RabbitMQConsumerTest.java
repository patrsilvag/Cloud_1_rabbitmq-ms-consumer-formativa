package com.example.rabbitmqconsumer.listeners;

import com.example.rabbitmqconsumer.services.MensajeRabbitMQService;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.amqp.rabbit.test.context.SpringRabbitTest;

import static org.mockito.Mockito.timeout;
import static org.mockito.Mockito.verify;

@SpringBootTest
@SpringRabbitTest
class RabbitMQConsumerTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @MockBean
    private MensajeRabbitMQService service;

    @Test
    void testConsumoMensaje_LlamaAlServicio() {
        String msg = "Hola Oracle";
        rabbitTemplate.convertAndSend("micola", msg);

        // Verificamos que el listener procese el mensaje y llame al servicio
        verify(service, timeout(2000)).guardarMensaje(msg);
    }
}
