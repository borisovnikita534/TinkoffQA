package ru.shop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.shop.dto.AddOrderRequest;
import ru.shop.model.Customer;
import ru.shop.model.Order;
import ru.shop.model.Product;
import ru.shop.service.CustomerService;
import ru.shop.service.OrderService;
import ru.shop.service.ProductService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final CustomerService customerService;
    private final ProductService productService;

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

    @PostMapping
    public void save(@RequestBody AddOrderRequest request) {
        Customer customer = customerService.getById(request.getCustomerId());
        Product product = productService.getById(request.getProductId());
        orderService.add(customer, product, request.getCount());
    }

}