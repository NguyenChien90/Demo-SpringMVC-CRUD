package ra.sevice;

import ra.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void save(Product product); // dung cho ca update va create
    void delete(Long id);
    Product findById(Long id);

}
