package com.example.urlshortner.URLShortner.repository;

import com.example.urlshortner.URLShortner.entity.URLDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UrlRepository extends JpaRepository<URLDetails, Long> {
    Optional<URLDetails> findByshortUrl(String url);
}
