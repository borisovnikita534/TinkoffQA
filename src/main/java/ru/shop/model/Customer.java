package ru.shop.model;

import lombok.*;

import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Customer {
    private UUID id;
    private String name;
    private String phone;
    private long age;
}
