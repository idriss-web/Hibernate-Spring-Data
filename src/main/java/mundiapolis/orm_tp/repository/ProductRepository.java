package mundiapolis.orm_tp.repository;

import mundiapolis.orm_tp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product,Long> {
}
