package com.jetbrains.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Configuration
@PropertySources({
        @PropertySource(name = "foo_bar", value = {"classpath:myProps1.properties", "classpath:myProps2.properties"}),
        @PropertySource(name = "boo", value = "classpath:myProps3.properties")
})
public class Config {
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
        try (final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {

        }
    }

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @Autowired
    public @interface MyInject {

    }
}
