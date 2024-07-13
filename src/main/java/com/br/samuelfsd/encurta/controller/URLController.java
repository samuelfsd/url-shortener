package com.br.samuelfsd.encurta.controller;

import com.br.samuelfsd.encurta.service.URLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/encurtai")
public class URLController {

    @Autowired
    private URLService service;

    @PostMapping
    public ResponseEntity<?> execute() {
        return ResponseEntity.ok(service.getShortURL());
    }
}
