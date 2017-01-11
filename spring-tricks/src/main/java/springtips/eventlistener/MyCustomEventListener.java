package springtips.eventlistener;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

@EventListener
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyCustomEventListener {

    @AliasFor(attribute = "condition", annotation = EventListener.class)
    String customConditionAttribute() default "";
}
