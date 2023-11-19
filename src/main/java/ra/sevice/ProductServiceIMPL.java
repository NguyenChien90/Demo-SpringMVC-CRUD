package ra.sevice;


import org.springframework.stereotype.Service;
import ra.model.Product;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductServiceIMPL implements IProductService{
    public static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1L,"Ao coc tay","Ao","Ao coc tay nam",100,true));
        productList.add(new Product(2L,"Ao dai tay","Ao","Ao dai tay nam",300,true));
        productList.add(new Product(3L,"Quan dui","Quan","Quan dui nam",200,true));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        if (findById(product.getProductId()) != null){
            productList.set(productList.indexOf(product),product); // sua product
        }else {
            productList.add(product); // tao product
        }

    }

    @Override
    public void delete(Long id) {
        productList.remove(findById(id));
    }

    @Override
    public Product findById(Long id) {
        for (Product product:productList) {
            if (product.getProductId().equals(id)){
                return product;
            }
        }
        return null;
    }
}
