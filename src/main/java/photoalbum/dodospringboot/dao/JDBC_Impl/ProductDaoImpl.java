package photoalbum.dodospringboot.dao.JDBC_Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import photoalbum.dodospringboot.dao.ProductDao;
import photoalbum.dodospringboot.model.Product;
import photoalbum.dodospringboot.rowMapper.ProductRowMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public Product getProductById(Integer productId) {
        String sql = "product_name, category, image_url , "+
                    " price, stock, description , " +
                    " created_date, last_modified_date " +
                    " FROM " +
                    " `product` WHERE product_Id = :product_Id ";

        Map<String , Object> map = new HashMap<>();
        map.put("productId" , productId);

        List<Product> queryProductList = namedParameterJdbcTemplate.query(sql, map, new ProductRowMapper());

        if(queryProductList.size() > 0){
            return queryProductList.get(0);
        }else{
            System.out.println(productId + "查無此productId");
            return null;
        }
    }
}
