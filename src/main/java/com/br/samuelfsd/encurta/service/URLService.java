package com.br.samuelfsd.encurta.service;

import com.br.samuelfsd.encurta.dto.URLRequestDTO;
import com.br.samuelfsd.encurta.dto.URLResponseDTO;
import com.br.samuelfsd.encurta.entity.URL;
import com.br.samuelfsd.encurta.repository.URLRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Service
public class URLService {

    @Autowired
    private URLRepository repository;


    public URLResponseDTO getShortURL(URLRequestDTO dto) {
        URL url = new URL();

        String shortURl = createShortURL();

        url.setLargeURL(dto.getUrl());
        url.setShortURL(shortURl);
        url.setExpiredAt(LocalDateTime.ofInstant(Instant.now().plusSeconds(300), ZoneId.systemDefault()));

        url = repository.save(url);

        var newURL = "http://asertw.com/" +  url.getShortURL();

        URLResponseDTO response = new URLResponseDTO();
        response.setUrl(newURL);

        return response;
    }

    private String createShortURL() {
        return RandomStringUtils.randomAlphanumeric(5,10);
    }
}
