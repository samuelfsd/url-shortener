package com.br.samuelfsd.encurta.dto;

public class URLRequestDTO {
    private String url;

    public URLRequestDTO() {}

    public URLRequestDTO(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
