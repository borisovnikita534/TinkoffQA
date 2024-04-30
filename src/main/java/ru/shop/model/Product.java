package ru.shop.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name ="product")
public class Product {
    @Id
    private UUID id;
    private String name;
    private long cost;
    @Enumerated(EnumType.STRING)
    private ProductType productType;
}
