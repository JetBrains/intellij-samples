package springtips.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@ComponentScan
public @interface MyComponentScan {

    @AliasFor(attribute = "basePackages", annotation = ComponentScan.class)
    String[] myPackagesAreListedHere() default {};

}
