package photoalbum.dodospringboot.service.JDBC_Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import photoalbum.dodospringboot.dao.ProductDao;
import photoalbum.dodospringboot.model.Product;
import photoalbum.dodospringboot.service.ProductService;

@Service
public class ProductImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
