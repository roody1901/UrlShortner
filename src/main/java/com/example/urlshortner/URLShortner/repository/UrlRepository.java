package com.example.urlshortner.URLShortner.repository;

import com.example.urlshortner.URLShortner.entity.URLDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlRepository extends JpaRepository<URLDetails, Long> {
}
