package mundiapolis.orm_tp;

import mundiapolis.orm_tp.entities.Product;
import mundiapolis.orm_tp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ProjetOrmApplication implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProjetOrmApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        productRepository.save(new Product(null, "Computer", 4300, 3));
//        productRepository.save(new Product(null, "Printer", 1200, 4));
//        productRepository.save(new Product(null, "Smart Phone", 3200, 32));

        List<Product> products = productRepository.findAll();
        products.forEach(p -> System.out.println(p));

        Product product = productRepository.findById(1L).get();
        System.out.println("***************");
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getQuantity());
        System.out.println("***************");

        List<Product> productList = productRepository.findByNameContains("C");
        productList.forEach(p -> System.out.println(p));

        System.out.println("----------------------");

        List<Product> productList2 = productRepository.search("%C%");
        productList2.forEach(p -> System.out.println(p));





        System.out.println("----------------------");

        List<Product> productList3 = productRepository.findByPriceGreaterThan(3000);
        productList3.forEach(p -> System.out.println(p));



        System.out.println("----------------------");

        List<Product> productList4 = productRepository.searchByPrice(3000);
        productList4.forEach(p -> System.out.println(p));




    }
}
