package com.example.urlshortner.URLShortner.entity;


import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name = "urlData")
public class URLDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }
}
