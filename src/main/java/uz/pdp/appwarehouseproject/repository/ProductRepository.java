package uz.pdp.appwarehouseproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.appwarehouseproject.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product ,Integer> {
}
