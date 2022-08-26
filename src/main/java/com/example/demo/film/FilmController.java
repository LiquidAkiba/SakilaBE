package com.example.demo.film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3306")
@RestController //Search for all packages below Spring Sakila, Looks for Rest Controllers
@RequestMapping("/Sakila")
public class FilmController {

    @Autowired  //Creates actor repository implementation
    private final FilmRepository filmRepository;

    public FilmController(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @GetMapping("/Get_Films")
    public @ResponseBody Iterable<Film> getFilms(){
        return filmRepository.findAll();
    }

    @DeleteMapping("/Delete_Film_By_Id")
    public @ResponseBody
    void deleteFilmById(@RequestParam int id){
        filmRepository.deleteById(id);
    }


}