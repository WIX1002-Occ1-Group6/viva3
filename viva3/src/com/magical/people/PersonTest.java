package com.magical.people;

public class PersonTest {
    public static void main(String[] args) {
        // 1
        Person p1 = new Person();
        Person p2 = new Person("AAA", 18);
        Person p3 = new Person("AAA", 18);
        Person p4 = new Person("BBB", 20);

        // System.out.println("p1: " + p1);
        // System.out.println("p2: " + p2);
        // System.out.println("p3: " + p3);
        // System.out.println("p4: " + p4);

        // 2
        System.out.println("\nTest setAge(): ");
        Integer age = 0;
        try {
            age = 25;
            p1.setAge(age);
            System.out.println("p1 setAge(" + age + ") OK: " + p1);
        } catch (IllegalArgumentException e) {
            System.out.println("p1 setAge(" + age + ") failed: " + e.getMessage());
        }
        try {
            age = -1;
            p1.setAge(age);
            System.out.println("p1 setAge(" + age + ") OK: " + p1);
        } catch (IllegalArgumentException e) {
            System.out.println("p1 setAge(" + age + ") failed: " + e.getMessage());
        }
        try {
            age = null;
            p1.setAge(age);
            System.out.println("p1 setAge(" + age + ") OK: " + p1);
        } catch (IllegalArgumentException e) {
            System.out.println("p1 setAge(" + age + ") failed: " + e.getMessage());
        }

        // 3
        System.out.println("\nTest compareTo():");
        System.out.println("p2 compareTo(p1): " + p2.compareTo(p1));
        System.out.println("p2 compareTo(p3): " + p2.compareTo(p3));
        System.out.println("p2 compareTo(p4): " + p2.compareTo(p4));

        // 4
        System.out.println("\nTotal count: " + Person.getPersonCount());
    }
}
