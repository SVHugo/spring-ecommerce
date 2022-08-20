package pe.company.ecommer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.company.ecommer.model.Product;

@Repository
public interface ProductoRepository extends JpaRepository<Product, Integer>{

	
}
