package com.datastax.examples.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.UUID;

@BasePathAwareController
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView method() {
        return new ModelAndView("redirect:" + "/swagger-ui/");
    }

    @GetMapping("orders/{id}")
    public ResponseEntity<List<Order>> getOrder(@PathVariable("oid") UUID oid) {
        return ResponseEntity.ok(orderRepository.findByKeyOrderId(oid));
    }

    @GetMapping("orders/{oid}/{pid}")
    public ResponseEntity<Order> getProductInOrder(@PathVariable("oid") UUID oid, @PathVariable("id") UUID pid) {
        return ResponseEntity.ok(orderRepository.findByKeyOrderIdAndKeyProductId(oid, pid));
    }

    @DeleteMapping("orders/{id}")
    public ResponseEntity deleteOrder(@PathVariable("oid") UUID oid) {
        orderRepository.deleteByKeyOrderId(oid);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("orders/{oid}/{pid}")
    public ResponseEntity deleteProductFromOrder(@PathVariable("oid") UUID oid, @PathVariable("id") UUID pid) {
        orderRepository.deleteByKeyOrderIdAndKeyProductId(oid, pid);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("orders/{id}")
    public ResponseEntity<Order> updateOrder(@PathVariable("id") UUID oid, @RequestBody Order order) {
        order.getKey().setOrderId(oid);
        return ResponseEntity.ok(orderRepository.save(order));
    }

    @PatchMapping("orders/{id}")
    public ResponseEntity patchOrder(@PathVariable("id") UUID oid, @RequestBody Order order) {
        return ResponseEntity.notFound().build();
    }
}
