package ru.shop.model;

import lombok.*;

import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Order {
    private UUID id;
    private UUID customerId;
    private UUID productId;
    private long count;
    private long amount;
}
