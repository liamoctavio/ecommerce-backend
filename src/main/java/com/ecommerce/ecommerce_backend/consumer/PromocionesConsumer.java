package com.ecommerce.ecommerce_backend.consumer;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.hibernate.annotations.Comment;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.ecommerce.ecommerce_backend.dto.PromocionDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Component
public class PromocionesConsumer {

    @RabbitListener(queues = "promocionesQueue")
    public void recibirPromocion(PromocionDTO promocion) {
        System.out.println("[PROMOCIÓN RECIBIDA] " + promocion);

        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

            File folder = new File("promociones_json");
            if (!folder.exists()) {
                folder.mkdir();
            }

            String timestamp = promocion.getFechaInicio().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
            File archivo = new File(folder, "promocion_" + timestamp + ".json");

            mapper.writeValue(archivo, promocion);
            System.out.println(" Archivo generado: " + archivo.getAbsolutePath());
        } catch (IOException e) {
            System.out.println(" Error al generar archivo JSON");
            e.printStackTrace();
        }
    }

}
