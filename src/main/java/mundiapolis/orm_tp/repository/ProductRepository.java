package mundiapolis.orm_tp.repository;

import mundiapolis.orm_tp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository  extends JpaRepository<Product,Long> {
    List<Product> findByNameContains(String mc);

}
