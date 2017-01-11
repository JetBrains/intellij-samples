package com.jetbrains.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.AliasFor;
import org.springframework.core.env.Environment;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Configuration
@PropertySources({
        @PropertySource(name = "foo_bar", value = {"classpath:com/jetbrains/spring/props1.properties",
                "classpath:com/jetbrains/spring/myProps2.properties"}),
        @PropertySource(name = "boo", value = "classpath:com/jetbrains/spring/myProps3.properties")
})
public class Config {
    @Autowired
    private Environment environment;

    private String name = environment.getProperty("service.name");

    @Bean
    public Integer numberOne() {
        return 1;
    }

    @MyInject
    public void init(Integer numberOne) {
        System.out.println(numberOne);
    }

    @Autowired
    public void init2(Integer numberOne) {
        System.out.println(numberOne);
    }

    public static void main(String... args) {
        new Config().run();
    }

    private void run() {
        System.out.printf("Starting %s service", name);
    }

    @MyEventListener(eventClasses = MyEvent.class, eventName = "${service.event.name}")
    public void listenForUserCreatedEvents(MyEvent event) {

    }

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @Autowired
    public @interface MyInject {

    }

    @EventListener
    @Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MyEventListener {
        @AliasFor(annotation = EventListener.class, attribute = "classes")
        Class<?>[] eventClasses() default {};

        @AliasFor(annotation = EventListener.class, attribute = "condition")
        String listenIf() default "";

        String eventName() default "";
    }

    class MyEvent {
        private String text;
        private String count;

        public String getText() {
            return text;
        }

        public String getCount() {
            return count;
        }
    }


}
