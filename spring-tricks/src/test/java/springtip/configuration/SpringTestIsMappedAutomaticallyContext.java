package springtip.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringTestIsMappedAutomaticallyContext {

    @Bean
    public String myStringBean() {
        return "Here I am ";
    }
}
