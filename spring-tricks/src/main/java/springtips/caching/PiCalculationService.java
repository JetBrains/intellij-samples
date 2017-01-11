package springtips.caching;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class PiCalculationService {

    @Cacheable("calcPi")
    public Double calcPi(int decimals) {
        // calc PI with given number of decimals
        // this can be a really expensive operation...
        return Math.PI;
    }
}
