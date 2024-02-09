package com.dev.inktown.controller;

import com.dev.inktown.entity.Order;
import com.dev.inktown.model.NewOrderRequestDto;
import com.dev.inktown.model.UpdateOrderStatusReqDto;
import com.dev.inktown.service.OrderService;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("test")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("Running");
    }
    @GetMapping("/getAll")
    public List<Order> getAllOrder(){
        return new ArrayList<>();
    }
    @GetMapping(value = "/getById/{orderId}")
    public Order getOrderById(@PathVariable("orderId") String orderId){
        return orderService.getOrderById(orderId);
    }

    @PostMapping("/create")
    public ResponseEntity<Order> createOrder(@RequestBody NewOrderRequestDto reqDto){
        System.out.println(reqDto);
        Order createdOrder = orderService.createOrder(reqDto);
        return ResponseEntity.ok(createdOrder);
    }
    @PostMapping("/updateStatus")
    public ResponseEntity<Order> updateOrderStatus(@RequestBody UpdateOrderStatusReqDto reqDto){
        System.out.println("prev123" + reqDto.getStatus());
        return ResponseEntity.ok(orderService.updateOrderStatus(reqDto));
    }
}
