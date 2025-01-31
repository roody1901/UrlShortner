package com.example.urlshortner.URLShortner.service;

import com.example.urlshortner.URLShortner.entity.URLDetails;
import com.example.urlshortner.URLShortner.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UrlServiceImplement implements UrlService{

    private UrlRepository urlRepository;

    @Autowired
    public UrlServiceImplement(UrlRepository urlRepository){
        this.urlRepository = urlRepository;
    }

    private final static String  elements = "abcedefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    @Override
    public String generateShortUrl(URLDetails urlData) {
        long uniqueRandom = urlData.getId();
        String shorturl =  convertToShort(uniqueRandom);
        urlData.setShortUrl(shorturl);
        urlRepository.save(urlData);
        return "crunchyurl.com/"+shorturl;
    }

    @Override
    public String getLongUrl(String shortUrl) {
      shortUrl =  shortUrl.substring("crunchyurl/".length());
      long id =0;
//       for(int i = 0;i<shortUrl.length();i++){
//           id  = id * 62 + (shortUrl.charAt(i));
//       }
        return "No urll found";
    }

    private String convertToShort(long n){
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            sb.insert(0,elements.charAt((int) (n%62)));
            n = n/62;
        }
        while(sb.length()!=7){
            sb.insert(0,'0');
        }

        return sb.toString();
    }
}
