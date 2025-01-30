package com.nagarro.product.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledCacheEvictionService {

    // Evict cache every 5 minutes
    @Scheduled(fixedRate = 60000)  // 300000 ms = 5 minutes
    @CacheEvict(value = "allProductscache", allEntries = true)
    public void evictCachePeriodically() {
        // Cache will be cleared every 5 minutes
    }
}