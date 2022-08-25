package com.example.demo.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/language")
public class LanguageController {
    @Autowired
    private final LanguageRepository languageRepository;

    public LanguageController(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @GetMapping
    public @ResponseBody
    Iterable<Language> getAll() {
        return languageRepository.findAll();
    }

    @GetMapping(params = {"name"})
    public @ResponseBody
    Language getByName(String name) {
        return languageRepository.findByName(name);
    }
}