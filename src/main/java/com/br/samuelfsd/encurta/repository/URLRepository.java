package com.br.samuelfsd.encurta.repository;

import com.br.samuelfsd.encurta.entity.URL;
import org.springframework.data.jpa.repository.JpaRepository;

public interface URLRepository extends JpaRepository<URL, Long> {
    URL findByShortURL(String shortURL);
}
