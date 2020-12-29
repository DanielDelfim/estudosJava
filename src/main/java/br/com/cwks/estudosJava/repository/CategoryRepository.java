package br.com.cwks.estudosJava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.cwks.estudosJava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    
}
