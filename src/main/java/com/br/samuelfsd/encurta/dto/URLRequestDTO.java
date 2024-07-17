package com.br.samuelfsd.encurta.dto;

public class URLRequestDTO {
    private String url;
    private String newUrl;

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

    public String getNewUrl() {
        return newUrl;
    }

    public void setNewUrl(String newUrl) {
        this.newUrl = newUrl;
    }
}
