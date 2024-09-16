package az.atlacademy.productms.dao.entity.repository;

import az.atlacademy.productms.dao.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
