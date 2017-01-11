package springtips.caching;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//@CacheConfig(cacheNames = "cachingService")
public class CachingServiceImpl implements CachingService {

    @Override
//    @Cacheable(cacheManager = "customCacheManager",
//            keyGenerator = "customKeyGenerator",
//            condition = "end - start < 100")
    public List<Integer> buildIntegerList(int start, int end) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = start; i < end; i++) {
            integerList.add(i);
        }
        return integerList;
    }
}
