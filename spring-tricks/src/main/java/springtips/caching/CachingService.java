package springtips.caching;

import org.springframework.cache.annotation.Cacheable;

import java.util.List;

interface CachingService {

    @Cacheable(cacheNames = "myCacheName")
    List<Integer> buildIntegerList(int start, int end);
}
