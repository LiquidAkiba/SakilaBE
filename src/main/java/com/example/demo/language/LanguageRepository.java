package com.example.demo.language;

import org.springframework.data.repository.CrudRepository;

public interface LanguageRepository extends CrudRepository<Language, Integer> {

    Language findByName(String name);
}
