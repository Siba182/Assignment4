package org.example;

import java.util.*;

public class CollectionInterfaces {

    public static void main(String[] args) {
        CollectionInterfaces ci = new CollectionInterfaces();
        ci.CollectionInterfaces();
        ci.arrayList();
        ci.hashSet();
        ci.hashMap();


    }

    private void CollectionInterfaces() {
        CollectionInterfaces color = new CollectionInterfaces();
        color.add("Set blue ");
        color.add("Map red ");
        color.add("List orange ");
        System.out.println("Collection sets: " + color);
    }

    void add(String set_blue_) {
    }


    public static void arrayList() {
        List<String> countries = new ArrayList<>();
        countries.add("South Africa");
        countries.add("Italy");
        countries.add("United States of America");
        System.out.println("Corona virus infected " + countries + "\n");

        countries.remove("Italy");
        System.out.println("Corona virus infected" + countries + "\n");
    }

    public void hashSet() {
        Set<String> tips = new HashSet<>();
        tips.add("Disinfect surfaces");
        tips.add("Wash your hands regularly");
        tips.add("Cover your mouth when coughing");
        tips.add("Be in crowded spaces");
        System.out.println("Initial list of safety tips" + tips);
        tips.remove("Initial list of safety tips");
        System.out.println("Correct list of safety tips " + tips);
    }

    public void hashMap() {
        HashMap <String, Integer> numberOfInfected = new HashMap<>();
        System.out.println();

        numberOfInfected.put("SA", 85);
        numberOfInfected.put("ITL", 3506);
        numberOfInfected.put("USA", 6499);

        System.out.println("Size of map is:- " + numberOfInfected.size());

        System.out.println();
        if (numberOfInfected.containsKey("SA")) {

            Integer a = numberOfInfected.get("SA");
            System.out.println("value for key" + " \"SA\" is:- " + a);
        }

    }

    public void contains(String map_red) {

    }

}