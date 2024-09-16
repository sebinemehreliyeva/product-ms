package az.atlacademy.productms.dao.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PRIVATE;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
@FieldDefaults(level = PRIVATE)
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    Long id;
    String name;
    Integer count;
    BigDecimal price;

}
