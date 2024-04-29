package ru.shop.repository;

import org.springframework.stereotype.Component;
import ru.shop.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class ProductRepository implements IRepository<Product> {

    List<Product> products = new ArrayList<>();

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Optional<Product> findById(UUID id) {
        return findAll().stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }


}
