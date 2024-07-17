package com.br.samuelfsd.encurta.controller;

import com.br.samuelfsd.encurta.dto.URLRequestDTO;
import com.br.samuelfsd.encurta.dto.URLResponseDTO;
import com.br.samuelfsd.encurta.service.URLService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping
public class URLController {

    @Autowired
    private URLService service;

    @PostMapping("/shorten-url")
    public ResponseEntity<URLResponseDTO> execute(@RequestBody URLRequestDTO dto) {
        return ResponseEntity.ok(service.saveShortURL(dto));
    }

    @GetMapping("/s/{code}")
    public void getNewURL(@PathVariable String code, HttpServletResponse httpServletResponse) throws IOException {
        try {
            URLResponseDTO response = service.findByShortURL(code);
            httpServletResponse.sendRedirect(response.getUrl());
        } catch (Exception e) {
             httpServletResponse.setStatus(HttpServletResponse.SC_NOT_FOUND);
             httpServletResponse.getWriter().write("Não foi encontrada uma URL com este código");
             throw new IOException(e);
        }
    }
}
