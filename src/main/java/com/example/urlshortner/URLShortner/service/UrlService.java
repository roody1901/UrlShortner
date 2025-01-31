package com.example.urlshortner.URLShortner.service;

import com.example.urlshortner.URLShortner.entity.URLDetails;

public interface UrlService {
    String generateShortUrl(URLDetails urlData);
    String getLongUrl(String shortUrl);
}
