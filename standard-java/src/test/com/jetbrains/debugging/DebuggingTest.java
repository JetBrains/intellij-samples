package com.jetbrains.debugging;

import com.jetbrains.inspections.Java9Inspections;
import com.jetbrains.persistence.models.OrderItem;
import com.jetbrains.persistence.models.Product;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ALL")
public class DebuggingTest {
    @Test
    public void shouldRenderPrimitiveTypes() {
        UnderTest underTest = new UnderTest();
        underTest.doSomething();

        System.out.println(underTest.getWords());
    }

    @Test
    public void shouldShowChangingValues() {
        UnderTest underTest = new UnderTest();
        underTest.doSomething();

        Java9Inspections java9Inspections = new Java9Inspections();

        IgnoreException ignoreException = new IgnoreException();

        UnderTest anotherUnderTest = new UnderTest();

        InlineDebugging inlineDebugging = new InlineDebugging();
    }

    @Test
    public void shouldOnlyRenderOnDemandRendererWhenClicked() {
        final OrderItem orderItem = new OrderItem();
        orderItem.setId(4738);
        orderItem.setQuantity(2);

        final Product product = new Product();
        product.setId(43789);
        product.setTitle("Book");
        product.setPrice(new BigDecimal("15.99"));
        product.setOrderItemsById(List.of(orderItem));

        System.out.println(product);
    }

    @Test
    public void shouldTriggerAnExceptionBreakpoint() {
        UnderTest underTest = new UnderTest();
        underTest.catchesCustomException();
    }

    @Test
    public void shouldNotTriggerAnExceptionBreakpoint() {
        IgnoreException ignoreException = new IgnoreException();
        ignoreException.catchesCustomException();
    }

    @Test
    public void shouldRunUsingADifferentJVM() {
        InlineDebugging forDebugging = new InlineDebugging();
        forDebugging.run();
    }

    private class UnderTest {
        private int someValue = 2;
        private AnotherClass anotherClass = new AnotherClass();
        private String[] words = {"This", "is", "an", "array", "of", "Strings"};
        private int[] integers = {1, 1, 2, 3, 5};

        private void doSomething() {
            someValue++;
        }

        public String[] getWords() {
            return words;
        }

        public void catchesCustomException() {
            try {
                anotherClass.throwException();
            } catch (CustomException e) {
                e.printStackTrace();
            }
        }
    }

    private class IgnoreException {
        private AnotherClass obj = new AnotherClass();
        private void catchesCustomException() {
            try {
                obj.throwException();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private class AnotherClass {
        private String value = "The Value";
        public void throwException() {
            throw new CustomException();
        }
    }

    private class CustomException extends RuntimeException {
    }
}