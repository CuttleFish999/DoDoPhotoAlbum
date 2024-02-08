package photoalbum.dodospringboot.dao;

import photoalbum.dodospringboot.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
