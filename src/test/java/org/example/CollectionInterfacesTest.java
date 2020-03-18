package org.example;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class CollectionInterfacesTest {

    @Test
    public void arrayList() {
        List<String> list1 = Arrays.asList("South Africa", "Italy", "United States of America");
        List<String> list2 = Arrays.asList("South Africa", "Italy", "United States of America");

        Assert.assertEquals(list1, list2);


    }

    @Test
    public void hashSet() {
        Set<String> tips1 = new HashSet<>();

        tips1.add("Disinfect surfaces");
        tips1.add("Wash your hands regularly");
        tips1.add("Cover your mouth when coughing");
        tips1.add("Be in crowded spaces");

        Set<String> tips2 = new HashSet<>();
        tips2.add("Disinfect surfaces");
        tips2.add("Wash your hands regularly");
        tips2.add("Cover your mouth when coughing");
        tips2.add("Be in crowded spaces");

        Assert.assertEquals(tips1, tips2);
    }

    @Test
    public void hashMap() {
        HashMap <String, Integer> numberOfInfected1 = new HashMap<>();

        numberOfInfected1.put("SA", 85);
        numberOfInfected1.put("ITL", 3506);
        numberOfInfected1.put("USA", 6499);

        HashMap <String, Integer> numberOfInfected2 = new HashMap<>();

        numberOfInfected2.put("SA", 85);
        numberOfInfected2.put("ITL", 3506);
        numberOfInfected2.put("USA", 6499);
        Assert.assertEquals(numberOfInfected1, numberOfInfected2);



    }
}