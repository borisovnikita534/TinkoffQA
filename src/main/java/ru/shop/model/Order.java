package ru.shop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "order")
public class Order {
    @Id
    private UUID id;
    private UUID customerId;
    private UUID productId;
    private long count;
    private long amount;
}
