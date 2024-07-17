package com.br.samuelfsd.encurta.service;

import com.br.samuelfsd.encurta.dto.URLRequestDTO;
import com.br.samuelfsd.encurta.dto.URLResponseDTO;
import com.br.samuelfsd.encurta.entity.URL;
import com.br.samuelfsd.encurta.repository.URLRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Service
public class URLService {

    @Autowired
    private URLRepository repository;

    public URLResponseDTO saveShortURL(URLRequestDTO dto) {
        URL url = new URL();

        url.setLargeURL(dto.getUrl());
        url.setShortURL(createShortURL());
        url.setExpiredAt(LocalDateTime.ofInstant(Instant.now().plusSeconds(300), ZoneId.systemDefault()));

        url = repository.save(url);

        URLResponseDTO response = new URLResponseDTO();
        response.setUrl(url.getLargeURL());
        response.setNewUrl(url.getShortURL());

        return response;
    }

    public URLResponseDTO findByShortURL(String shortURL) {
        URL url = repository.findByShortURL(shortURL);

        if (url == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Não foi encotnrada uma URL com este código");
        }

        URLResponseDTO response = new URLResponseDTO();
        response.setUrl(url.getLargeURL());
        response.setNewUrl(url.getShortURL());

        return response;
    }

    private String createShortURL() {
        return RandomStringUtils.randomAlphanumeric(5,10);
    }
}
