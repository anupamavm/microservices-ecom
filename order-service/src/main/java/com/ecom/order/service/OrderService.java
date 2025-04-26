package com.ecom.order.service;

import com.ecom.order.dto.OrderRequest;
import com.ecom.order.model.Order;
import com.ecom.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    public void placeOrder( OrderRequest orderRequest ){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setSkuCode(orderRequest.skuCode());
        order.setQuantity(orderRequest.quatity());

        orderRepository.save(order);
    }
}
