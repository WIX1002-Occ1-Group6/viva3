package com.magical.people;

public class Person {
    private String name;
    private Integer age;

    private static final int DEFAULT_AGE = 18;
    private static int personCount = 0;

    public Person() {
        this.name = "Unknown Student";
        this.age = DEFAULT_AGE;
        personCount++;
    }

    public Person(String name, Integer age) {
        this.name = name;
        if (age != null && age < 0) {
            throw new IllegalArgumentException("Error!");
        }
        this.age = age;
        personCount++;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        if (age != null && age < 0) {
            throw new IllegalArgumentException("Error!");
        }
        this.age = age;
    }

    public static int getPersonCount() {
        return personCount;
    }

    public boolean compareTo(Person other) {
        if (other == null) {
            return false;
        }
        boolean isNameSame = this.name.equals(other.name);
        boolean isAgeSame = (this.age == null && other.age == null) || (this.age != null && this.age.equals(other.age));
        return isNameSame && isAgeSame;
    }
}
