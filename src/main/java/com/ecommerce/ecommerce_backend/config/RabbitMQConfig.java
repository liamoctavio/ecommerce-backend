// package com.ecommerce.ecommerce_backend.config;


// import org.springframework.amqp.core.Queue;
// import org.springframework.amqp.rabbit.core.RabbitTemplate;
// import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.amqp.support.converter.MessageConverter;
// import org.springframework.amqp.rabbit.connection.ConnectionFactory;


// @Configuration
// public class RabbitMQConfig {
    
//     @Bean
//     public Queue myQueue() {
//         return new Queue("ventasQueue", true);
//     }

//     @Bean
//     public Queue promocionesQueue() {
//         return new Queue("promocionesQueue", true);
//     }

//     @Bean
//     public Queue inventarioQueue() {
//         return new Queue("inventarioQueue", true);
//     }

//     @Bean
//     public MessageConverter jsonMessageConverter() {
//         return new Jackson2JsonMessageConverter(); 
//     }

//     @Bean
//     public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
//         RabbitTemplate template = new RabbitTemplate(connectionFactory);
//         template.setMessageConverter(jsonMessageConverter());
//         return template;
//     }

// }
