package com.jetbrains.testing;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class JUnit4To5 {
    @BeforeAll
    public static void beforeClass() throws Exception {
        // this is run once before all the tests are run
        // use it for more expensive operations that are required by the tests, e.g. setting up connections
        System.out.println("JUnit4To5.beforeClass");
    }

    @BeforeEach
    public void before() throws Exception {
        // This is run before every test is run
        // use it, for example, to set up clean data
        System.out.println("JUnit4To5.before");
    }

    @Test
    public void shouldMigrateASimpleTest() {
        Assertions.assertEquals("expected", "expected");
    }

    @Test
    @Disabled
    public void shouldMigrateIgnoreTestToDisabledTest() {
        // This test is Ignored in JUnit 4 and should be Disabled in JUnit 5"
    }

    @Test
    public void shouldStillSupportHamcrestMatchers() {
        assertThat(1, equalTo(1));
    }

    @Test
    public void shouldStillSupportAssume() {
        Assumptions.assumeTrue(javaVersion() > 8);
        // then go ahead and run the rest of the test
    }

    @AfterEach
    public void after() throws Exception {
        // this is run after every test
        // use it, for example, to clean up after the test
        System.out.println("JUnit4To5.after");
    }

    @AfterAll
    public static void afterClass() throws Exception {
        // this is run once after all tests are run
        // use it for expensive clean up operations, closing connections etc
        System.out.println("JUnit4To5.afterClass");
    }

    //<editor-fold desc="Helper methods">
    private int javaVersion() {
        // stub method. just used for the example
        return 14;
    }
    //</editor-fold>

}

