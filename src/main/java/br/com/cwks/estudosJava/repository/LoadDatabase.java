package br.com.cwks.estudosJava.repository;

import br.com.cwks.estudosJava.entities.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(PersonRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Person("Bilbo Baggins", "burglar", 967)));
      log.info("Preloading " + repository.save(new Person("Frodo Baggins", "thief", 786950)));
    };
  }
}