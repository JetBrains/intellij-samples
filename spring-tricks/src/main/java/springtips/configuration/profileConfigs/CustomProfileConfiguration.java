package springtips.configuration.profileConfigs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("customProfile")
public class CustomProfileConfiguration {

    @Bean(name = "customProfileLongBean")
    public Long profile1Long() {
        return 1L;
    }

}
