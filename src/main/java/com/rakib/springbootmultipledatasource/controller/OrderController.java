package com.rakib.springbootmultipledatasource.controller;

import com.rakib.springbootmultipledatasource.db_config.order.entity.Order;
import com.rakib.springbootmultipledatasource.db_config.order.repository.OrderRepository;
import com.rakib.springbootmultipledatasource.db_config.user.entity.User;
import com.rakib.springbootmultipledatasource.db_config.user.repostory.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final OrderRepository orderRepository;
    private final UserRepository userRepository;

    @PostMapping("/save-order")
    public void saveOrder() {
        Order order = new Order();
        order.setId(1L);
        order.setProductName("TEST");
        orderRepository.save(order);

        User user = new User();
        user.setId(1L);
        user.setUserName("ttest");
        userRepository.save(user);
    }
}
