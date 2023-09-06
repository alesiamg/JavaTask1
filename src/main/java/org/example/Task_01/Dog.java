package org.example.Task_01;

public class Dog extends Animal {
    private static final String name = generateRandomName();

    public Dog() {
        super(name);
    }
    @Override
    public void run(int length) {
        if (length <= 500) {
            System.out.println("Dog " + getName() + " run " + length + " meters");
        } else {
            System.out.println("Dog " + getName() + " can't run more than " + length + " meters");
        }
    }
    @Override
    public void swim(int length) {
        if (length <= 10) {
            System.out.println("Dog " + getName() + " swim " + length + " meters");
        } else {
            System.out.println("Dog " + getName() + " can't swim more than " + length + " meters");
        }
    }
}
