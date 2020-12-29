package br.com.cwks.estudosJava.repository;

import br.com.cwks.estudosJava.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

interface PersonRepository extends JpaRepository<Person, Long>{

}
