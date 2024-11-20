package springsecurityst4.Services;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import springsecurityst4.Repositories.ProductRepository;
import springsecurityst4.entity.Product;

public class UserServiceImpl implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired 
	private ProductRepository repo; 
	public ProductServiceImpl(ProductRepository repo) { this.repo = repo; } 
	@Override 
	public List<Product> listAll() { return repo.findAll(); } 
	@Override 
	public Product save(Product product) { return repo.save(product); } 
	@Override 
	public Product get(Long id) { return repo.findById(id).orElse(null); } 
	@Override 
	public void delete(Long id) { repo.deleteById(id); }
}
