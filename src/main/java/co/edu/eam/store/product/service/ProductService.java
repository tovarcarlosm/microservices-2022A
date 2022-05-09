package co.edu.eam.store.product.service;

import co.edu.eam.store.product.entity.Category;
import co.edu.eam.store.product.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> listAllProduct();
    public List<Product> findByCategory(Category category);
    public Product getProduct(Long id);
    public Product createProduct(Product product);
    public Product updateProduct(Product product);
    public Product deleteProduct(Long id);
    public Product updateStock(Long id, Double quantity);
}
