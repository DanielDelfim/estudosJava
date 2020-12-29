package br.com.cwks.estudosJava.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.cwks.estudosJava.entities.Category;
import br.com.cwks.estudosJava.repository.CategoryRepository;

public class CategoryService {
    
    @Autowired
    public CategoryRepository rCategoryRepository;

    public Category find(Integer id) {
        Optional<Category> obj = rCategoryRepository.findById(id);
        return obj.orElse(null);
        }

}
