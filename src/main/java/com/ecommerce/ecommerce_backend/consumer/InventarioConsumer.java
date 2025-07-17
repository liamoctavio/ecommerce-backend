// package com.ecommerce.ecommerce_backend.consumer;

// import org.springframework.amqp.rabbit.annotation.RabbitListener;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;


// import com.ecommerce.ecommerce_backend.dto.InventarioDTO;
// import com.ecommerce.ecommerce_backend.model.Inventario;
// import com.ecommerce.ecommerce_backend.repository.InventarioRepository;

// @Component
// public class InventarioConsumer {

//     @Autowired
//     private InventarioRepository inventarioRepository;

//     @RabbitListener(queues = "inventarioQueue")
//     public void recibirInventario(InventarioDTO dto) {
//         System.out.println("[INVENTARIO RECIBIDO] " + dto);

//         Inventario inv = new Inventario();
//         inv.setProducto(dto.getProducto());
//         inv.setCantidad(dto.getCantidad());

//         inventarioRepository.save(inv);
//         System.out.println(" Inventario actualizado");
//     }

// }
