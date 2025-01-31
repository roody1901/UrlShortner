package com.example.urlshortner.URLShortner.controller;

import com.example.urlshortner.URLShortner.entity.URLDetails;
import com.example.urlshortner.URLShortner.repository.UrlRepository;
import com.example.urlshortner.URLShortner.service.UrlServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/url/")
public class UrlController {

    @Autowired
    private UrlServiceImplement urlService;

    @PostMapping("/urls")
    public ResponseEntity<?> generateShorUrl(@RequestBody URLDetails urlData){
       String shortUrl = urlService.generateShortUrl(urlData);
        return new ResponseEntity<>(shortUrl, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<?> callLongUrl(@RequestParam("shortedurl") String shortedurl){
        String shortUrl = urlService.getLongUrl(shortedurl);
        return new ResponseEntity<>(shortUrl, HttpStatus.OK);
    }
}
