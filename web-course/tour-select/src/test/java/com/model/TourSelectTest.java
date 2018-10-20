package com.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TourSelectTest {

    @Test
    public void getAvailableToursWhenListIsNotEmpty() {
        //GIVEN:
        List<String> tours;
        String expectedTour1 = "Tour1";
        String expectedTour2 = "Tour2";
        String actualTour1;
        String actualTour2;

        //WHEN:
        tours = new ArrayList<>();
        tours.add(expectedTour1);
        tours.add(expectedTour2);

        //THEN:
        actualTour1 = tours.get(0);
        actualTour2 = tours.get(1);
        Assert.assertEquals(expectedTour1, actualTour1);
        Assert.assertEquals(expectedTour2, actualTour2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getAvailableToursWhenListIsEmpty() {
        //GIVEN:
        List<String> tours;
        String expectedTour1 = "";
        String actualTour1;

        //WHEN:
        tours = new ArrayList<>();

        //THEN:
        actualTour1 = tours.get(0);
        Assert.assertEquals(expectedTour1, actualTour1);
    }
}