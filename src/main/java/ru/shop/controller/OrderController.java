package ru.shop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.shop.model.Customer;
import ru.shop.model.Order;
import ru.shop.service.CustomerService;
import ru.shop.service.OrderService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final CustomerService customerService;

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.findAll();
    }

    @GetMapping("/customer/{customerId}")
    public List<Order> getByCustomerId(@PathVariable UUID customerId) {
        return orderService.findByCustomerId(customerId);
    }

    @GetMapping("/customer/{customerId}/total")
    public long getCustomerTotal(@PathVariable UUID customerId) {
        Customer customer = customerService.getById(customerId);
        return orderService.getTotalCustomerAmount(customer);
    }

}
