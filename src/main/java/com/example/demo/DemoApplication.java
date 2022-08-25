package com.example.demo;

import com.example.demo.actor.Actor;
import com.example.demo.actor.ActorRepository;
import com.example.demo.category.Category;
import com.example.demo.category.CategoryRepository;
import com.example.demo.film.Film;
import com.example.demo.film.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@CrossOrigin(origins="*")
@SpringBootApplication
@RestController  //handles GET, POST, DELETE, PUT requests
@RequestMapping("/Sakila")
public class DemoApplication {
	@Autowired
	private ActorRepository actorRepository;
	private FilmRepository filmRepository;
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public DemoApplication(ActorRepository actorRepository, FilmRepository filmRepository, CategoryRepository categoryRepository) {
		this.actorRepository = actorRepository;
		this.filmRepository = filmRepository;
		this.categoryRepository = categoryRepository;
	}

}