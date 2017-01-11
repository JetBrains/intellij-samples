package springtips.configuration.springFactories;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

// will be registered automatically
public class MyApplicationListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
    }
}
