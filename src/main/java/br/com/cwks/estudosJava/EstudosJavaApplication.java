package br.com.cwks.estudosJava;

import br.com.cwks.estudosJava.entities.*;

import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstudosJavaApplication {

	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("type the name");

		  System.out.println("type the e-mail");

		  System.out.println("type the telephone number");

		Person daniel = new Person("Daniel", "dmdelfim@gmail", 5858);
		daniel.printPerson("fds", "fds", 904538);
		System.out.println(daniel.getName());

		sc.close();
	  }

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	

	
}
