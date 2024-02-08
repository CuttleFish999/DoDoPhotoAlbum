package photoalbum.dodospringboot.rowMapper;

import org.springframework.jdbc.core.RowMapper;
import photoalbum.dodospringboot.model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Product product = new Product();

//        product.setProduct_Id(resultSet.getInt("product_id"));
//        product.setProductName(resultSet.getString("product_name"));
//        product.setCategory(resultSet.getString("category"));
//        product.setImage_url(resultSet.getString("image_url"));
//        product.setPrice(resultSet.getInt("price"));
//        product.setStock(resultSet.getInt("stock"));
//        product.setDescription(resultSet.getString("description"));
//        product.setCreated_date(resultSet.getTimestamp("created_date"));
//        product.setLast_modified_date(resultSet.getTimestamp("last_modified_date"));

        product.setProduct_Id(resultSet.getInt("product_id"));
        product.setProductName(resultSet.getString("product_name"));
        product.setCategory(resultSet.getString("category"));
        product.setImage_url(resultSet.getString("image_url"));
        product.setPrice(resultSet.getInt("price"));
        product.setStock(resultSet.getInt("stock"));
        product.setDescription(resultSet.getString("description"));
        product.setCreated_date(resultSet.getTimestamp("created_date"));
        product.setLast_modified_date(resultSet.getTimestamp("last_modified_date"));


        return product;
    }
}
