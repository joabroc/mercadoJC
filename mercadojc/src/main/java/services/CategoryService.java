package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joabeborges.mercadojc.entities.Category;

import repository.CategoryRepository;

@RestController
@RequestMapping(value = "/categories")
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping
	public List<Category> findAll() {
		List<Category> result = categoryRepository.findAll();
		return result;
	}
	
}
