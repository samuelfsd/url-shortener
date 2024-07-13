package com.br.samuelfsd.encurta.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_url")
public class URL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "short_url")
    private String shortURL;

    @Column(name = "large_url")
    private String largeURL;

    @Column(name = "expired_at")
    private LocalDateTime expiredAt;

    public URL(){}

    public URL(Long id, String shortURL, String largeURL, LocalDateTime expiredAt) {
        this.id = id;
        this.shortURL = shortURL;
        this.largeURL = largeURL;
        this.expiredAt = expiredAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShortURL() {
        return shortURL;
    }

    public void setShortURL(String shortURL) {
        this.shortURL = shortURL;
    }

    public String getLargeURL() {
        return largeURL;
    }

    public void setLargeURL(String largeURL) {
        this.largeURL = largeURL;
    }

    public LocalDateTime getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(LocalDateTime expiredAt) {
        this.expiredAt = expiredAt;
    }
}
