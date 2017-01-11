package springtips.configuration.profileConfigs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("mainProfile")
@Configuration
public class ScannedConfiguration {

    @Bean(name = "longBean1")
    public Long profile1Long() {
        return 1L;
    }

    @Bean(name = "longBean2")
    public Long profile2Long() {
        return 1L;
    }
}
