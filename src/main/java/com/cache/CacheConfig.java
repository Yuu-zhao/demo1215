package com.cache;

import com.github.benmanes.caffeine.cache.AsyncCache;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import org.springframework.stereotype.Component;

@Component
public class CacheConfig {
    private static Cache<String,String> CACHE;
    private static LoadingCache<String,String> CACHE_LOADING;
    private static AsyncCache<String,String> CACHE_ASYNC;

    public void init(){

    }
}
