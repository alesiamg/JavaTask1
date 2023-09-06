package org.example.Task_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class Animal {

    public Animal(String name) {
    }

    public String getName() {
        return generateRandomName();
    }

    public void run(int length) {
        System.out.println(getName() + " run " + length + " meters");
    }
    public void swim(int length) {
        System.out.println(getName() + " swim " + length + " meters");
    }

    public static String generateRandomName() {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Charlie", "Poppy", "Oliver",
                "Sophie", "Milo", "Lucky", "Oskar"));
        Random random = new Random();
        int randomIndex = random.nextInt(names.size());
        return names.get(randomIndex);

    }
}
