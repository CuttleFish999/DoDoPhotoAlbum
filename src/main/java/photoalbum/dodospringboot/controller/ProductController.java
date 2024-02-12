package photoalbum.dodospringboot.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import photoalbum.dodospringboot.dao.SpringJPA_Impl.ProductRepository;
import photoalbum.dodospringboot.model.Product;

import java.util.ArrayList;
import java.util.List;

//@RestController
@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    //  SpringJPA
    @PostMapping("/InsertProducts")
    public Integer insertProduct(@RequestBody Product product){

        productRepository.save(product);
        return product.getProid();
    }
    @GetMapping("/GetProducts")
    public String insertProduct(Model model){
        List<Product> productList = new ArrayList<>();
        productRepository.findAll().forEach(productList::add);
        model.addAttribute("products" , productList);

        System.out.println(productList.get(0).getProid());
        return "index";
    }
}
