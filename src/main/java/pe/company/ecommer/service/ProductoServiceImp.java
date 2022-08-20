package pe.company.ecommer.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.company.ecommer.model.Product;
import pe.company.ecommer.repository.ProductoRepository;

@Service
public class ProductoServiceImp implements ProductoService{

	@Autowired
	private ProductoRepository repository;
	
	@Override
	@Transactional
	public void insert(Product product) {
		// TODO Auto-generated method stub
		
		repository.save(product);
	}

	@Override
	@Transactional
	public void update(Product product) {
		// TODO Auto-generated method stub
		
		repository.save(product);
	}

	@Override
	@Transactional
	public void deleteById(Integer productId) {
		// TODO Auto-generated method stub
		repository.deleteById(productId);
	}

	@Override
	@Transactional(readOnly = true)
	public Product findById(Integer productoId) {
		// TODO Auto-generated method stub
		return repository.findById(productoId).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Product> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
