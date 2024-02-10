package photoalbum.dodospringboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import photoalbum.dodospringboot.dao.SpringJPA_Impl.ProductRepository;
import photoalbum.dodospringboot.model.Product;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    //  SpringJPA
    @PostMapping("/InsertProducts")
    public Integer insertProduct(@RequestBody Product product){

        productRepository.save(product);
        return product.getProid();
    }
}
