package photoalbum.dodospringboot.service.SpringJPA_Impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import photoalbum.dodospringboot.model.Product;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    // 這裡使用了方法名約定來定義查詢
    Optional<Product> findByProductId(Integer productId);
}
