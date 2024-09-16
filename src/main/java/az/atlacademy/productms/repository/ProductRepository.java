package az.atlacademy.productms.repository;

import az.atlacademy.productms.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}