package br.com.cwks.estudosJava.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cwks.estudosJava.entities.Category;
import br.com.cwks.estudosJava.repositories.CategoryRepository;

@Service
public class CategoryService {
    
    @Autowired
    public CategoryRepository rCategoryRepository;

    public Category find(Integer id) {
        Optional<Category> obj = rCategoryRepository.findById(id);
        return obj.orElse(null);
        }

}
