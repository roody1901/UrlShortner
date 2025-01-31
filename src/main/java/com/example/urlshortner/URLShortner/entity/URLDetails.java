package com.example.urlshortner.URLShortner.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "urlData")
public class URLDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;

    private String userId;

    private String shortUrl;
    private String longUrl;

    public URLDetails(){
        //no argument constructor
    }
    public URLDetails(long id, String userId, String shortUrl, String longUrl){
        this.id  = id;
        this.userId = userId;
        this.shortUrl = shortUrl;
        this.longUrl = longUrl;
    }
}
