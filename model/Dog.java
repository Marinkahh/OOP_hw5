package org.example.seminar5.hw.model;

public class Dog implements Comparable<Dog>{
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Песелю " + name + " " + age + "лет";
    }

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Dog dog) {
        if(age == dog.getAge()){
            return 0;
        }
        if(age < dog.getAge()){
            return -1;
        }
        return 1;
    }
}
