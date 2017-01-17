package com.jetbrains.refactoring;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PipelinesTest {

    @Test
    public void shouldAcquireData() {
        String data = "office, country, telephone\n" +
                      "Chicago, USA, +1 312 373 1000\n" +
                      "Beijing, China, +86 4008 900 505\n" +
                      "\n" +
                      "Porto Alegre, Brazil, +55 51 3079 3550\n" +
                      "Chengdu, China, +86 4008 900 505";
        List<Pipelines.CityAndPhone> actual = Pipelines.acquireData(data);

        Pipelines.CityAndPhone beijing = new Pipelines.CityAndPhone("Beijing", "+86 4008 900 505");
        Pipelines.CityAndPhone chengdu = new Pipelines.CityAndPhone("Chengdu", "+86 4008 900 505");
        Assert.assertThat(actual, CoreMatchers.is(Arrays.asList(beijing, chengdu)));
    }

}