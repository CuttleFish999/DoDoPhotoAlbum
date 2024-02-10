package photoalbum.dodospringboot.dao.SpringJPA_Impl;

import org.springframework.data.repository.CrudRepository;
import photoalbum.dodospringboot.model.Product;


public interface ProductRepository extends CrudRepository<Product,Integer>{

}
