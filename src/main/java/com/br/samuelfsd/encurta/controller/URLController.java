package com.br.samuelfsd.encurta.controller;

import com.br.samuelfsd.encurta.dto.URLRequestDTO;
import com.br.samuelfsd.encurta.dto.URLResponseDTO;
import com.br.samuelfsd.encurta.service.URLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/shorten-url")
public class URLController {

    @Autowired
    private URLService service;

    @PostMapping
    public ResponseEntity<URLResponseDTO> execute(@RequestBody URLRequestDTO dto) {
        return ResponseEntity.ok(service.getShortURL(dto));
    }
}
