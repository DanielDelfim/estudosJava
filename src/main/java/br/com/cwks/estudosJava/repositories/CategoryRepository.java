package br.com.cwks.estudosJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.cwks.estudosJava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    
}
