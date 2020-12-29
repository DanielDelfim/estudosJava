package br.com.cwks.estudosJava.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cwks.estudosJava.entities.Category;
import br.com.cwks.estudosJava.services.CategoryService;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {
    
   @Autowired
   public CategoryService sCategoryService;

   @RequestMapping(value ="/id", method = RequestMethod.GET)
   public ResponseEntity<?> find(@PathVariable Integer id){
       Category objCategory = sCategoryService.find(id);
       return ResponseEntity.ok().body(objCategory);
   }

}
