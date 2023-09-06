package org.example.Task_01;

public class Cat extends Animal {
    private static final String name = generateRandomName();
    public Cat() {
        super(name);
    }
    @Override
    public void run(int length) {
        if (length <= 200) {
            System.out.println("Cat " + getName() + " run " + length + "meters");
        } else {
            System.out.println("Cat " + getName() + " can't run more than " + length + " meters");
        }
    }
    @Override
    public void swim(int length) {
        System.out.println("Cat " + getName() + " can't swim at all");
    }
}



