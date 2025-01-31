package com.example.urlshortner.URLShortner.service;

import com.example.urlshortner.URLShortner.entity.URLDetails;
import com.example.urlshortner.URLShortner.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UrlServiceImplement implements UrlService{

    private UrlRepository urlRepository;

    @Autowired
    public UrlServiceImplement(UrlRepository urlRepository){
        this.urlRepository = urlRepository;
    }

    @Override
    public String generateShortUrl(URLDetails urlData) {
        return null;
    }

    @Override
    public String getLongUrl(String shortUrl) {
        return null;
    }
}
