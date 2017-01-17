package com.jetbrains.inspections;

import com.jetbrains.inspections.Java8Inspections.CityAndPhone;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Java8InspectionsTest {

    @Test
    public void shouldAcquireData() {
        String data = "office, country, telephone\n" +
                      "Chicago, USA, +1 312 373 1000\n" +
                      "Beijing, China, +86 4008 900 505\n" +
                      "Porto Alegre, Brazil, +55 51 3079 3550\n" +
                      "Chengdu, China, +86 4008 900 505";
        List<CityAndPhone> actual = Java8Inspections.acquireData(data);

        CityAndPhone beijing = new CityAndPhone("Beijing", "+86 4008 900 505");
        CityAndPhone chengdu = new CityAndPhone("Chengdu", "+86 4008 900 505");
        Assert.assertThat(actual, CoreMatchers.is(Arrays.asList(beijing, chengdu)));
    }

}