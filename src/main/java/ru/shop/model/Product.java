package ru.shop.model;

import lombok.*;

import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Product {
    private UUID id;
    private String name;
    private long cost;
    private ProductType productType;
}
