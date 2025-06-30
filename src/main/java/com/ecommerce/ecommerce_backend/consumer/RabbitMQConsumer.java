package com.ecommerce.ecommerce_backend.consumer;

import com.rabbitmq.client.*;
import com.rabbitmq.client.ConnectionFactory;
import java.io.IOException;
import java.util.concurrent.TimeoutException;



public class RabbitMQConsumer {

    private final static String QUEUE_NAME = "myQueue";

    public static void main (String[] argv) throws IOException, TimeoutException {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();


        boolean durable = true;

        channel.queueDeclare(QUEUE_NAME, durable, false, false, null);

        System.out.println("[*] Waiting for messages. To exit press CTRL+C");

        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody(), "UTF-8");
            System.out.println("[x] Received '" + message + "'");
        };

        channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> { });

    }

}
