package springsecurityst4.Services;

import java.util.List;

import springsecurityst4.entity.Product;

public interface UserService {
	void delete(Long id); 
	Product get(Long id); 
	Product save(Product product); 
	List<Product> listAll();
}
