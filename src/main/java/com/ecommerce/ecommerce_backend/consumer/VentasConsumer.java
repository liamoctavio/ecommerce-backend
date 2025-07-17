// package com.ecommerce.ecommerce_backend.consumer;

// import org.springframework.amqp.rabbit.annotation.RabbitListener;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;

// import com.ecommerce.ecommerce_backend.dto.VentaDTO;
// import com.ecommerce.ecommerce_backend.model.Venta;
// import com.ecommerce.ecommerce_backend.repository.VentaRepository;

// @Component
// public class VentasConsumer {

//     // @RabbitListener(queues = "ventasQueue")
//     // public void recibirVenta(VentaDTO venta) {
//     //     System.out.println("[VENTA RECIBIDA] " + venta);
//     //     // Aquí luego puedes guardar en Oracle con JPA o JDBC
//     // }

//     @Autowired
//     private VentaRepository ventaRepository;

//     @RabbitListener(queues = "ventasQueue")
//     public void recibirVenta(VentaDTO dto) {
//         System.out.println("[VENTA RECIBIDA] " + dto);

//         Venta venta = new Venta();
//         venta.setProducto(dto.getProducto());
//         venta.setMonto(dto.getMonto());
//         venta.setFecha(dto.getFecha());

//         ventaRepository.save(venta);
//         System.out.println("✅ Venta guardada en Oracle");
//     }

// }
