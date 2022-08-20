package pe.company.ecommer.service;

import java.util.Collection;

import pe.company.ecommer.model.Product;

public interface ProductoService {
	
	public abstract void insert(Product product);
	public abstract void update(Product product);
	public abstract void deleteById(Integer productId);
	public abstract Product findById(Integer productoId);
	public abstract Collection<Product> findAll();
	
	
}
