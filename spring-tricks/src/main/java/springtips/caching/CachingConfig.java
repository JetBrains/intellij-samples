package springtips.caching;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.interceptor.SimpleKeyGenerator;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("springtips.caching.*")
@EnableCaching
public class CachingConfig {

    @Bean
    public CacheManager customCacheManager() {
        return new SimpleCacheManager();
    }

    @Bean
    public KeyGenerator customKeyGenerator() {
        return new SimpleKeyGenerator();
    }
}
