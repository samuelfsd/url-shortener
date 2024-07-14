package com.br.samuelfsd.encurta.service;

import com.br.samuelfsd.encurta.dto.URLRequestDTO;
import com.br.samuelfsd.encurta.dto.URLResponseDTO;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

@Service
public class URLService {


    public URLResponseDTO getShortURL(URLRequestDTO dto) {
        String shortURl = createShortURL();
        System.out.println(shortURl);

        URLResponseDTO response = new URLResponseDTO();
        response.setUrl(shortURl);

        return response;
    }

    private String createShortURL() {
        return RandomStringUtils.randomAlphanumeric(5,10);
    }
}
