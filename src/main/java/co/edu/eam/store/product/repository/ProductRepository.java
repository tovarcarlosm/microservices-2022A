package co.edu.eam.store.product.repository;

import co.edu.eam.store.product.entity.Category;
import co.edu.eam.store.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findByCategory(Category category);
}
