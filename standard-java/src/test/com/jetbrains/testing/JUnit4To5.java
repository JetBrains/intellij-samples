package com.jetbrains.testing;

import org.junit.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class JUnit4To5 {
    @BeforeClass
    public static void beforeClass() throws Exception {
        // this is run once before all the tests are run
        // use it for more expensive operations that are required by the tests, e.g. setting up connections
        System.out.println("JUnit4To5.beforeClass");
    }

    @Before
    public void before() throws Exception {
        // This is run before every test is run
        // use it, for example, to set up clean data
        System.out.println("JUnit4To5.before");
    }

    @Test
    public void shouldMigrateASimpleTest() {
        Assert.assertEquals("expected", "expected");
    }

    @Test
    @Ignore
    public void shouldMigrateIgnoreTestToDisabledTest() {
        // This test is Ignored in JUnit 4 and should be Disabled in JUnit 5"
    }

    @Test
    public void shouldStillSupportHamcrestMatchers() {
        assertThat(1, equalTo(1));
    }

    @Test
    public void shouldStillSupportAssume() {
        Assume.assumeTrue(javaVersion() > 8);
        // then go ahead and run the rest of the test
    }

    @After
    public void after() throws Exception {
        // this is run after every test
        // use it, for example, to clean up after the test
        System.out.println("JUnit4To5.after");
    }

    @AfterClass
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

