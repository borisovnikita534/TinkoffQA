package ru.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Data
@AllArgsConstructor
@Getter
@Setter
public class AddOrderRequest {
    UUID productId;
    UUID customerId;
    int count;
}
