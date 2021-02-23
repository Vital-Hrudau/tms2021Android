package com.home.model;

import com.home.InvalidNameSurnameException;

import javax.naming.InvalidNameException;
import java.util.Random;

public class Person {
    private Address address;
    private int age;
    private String name;
    private String surname;
    private int height;
    private char sex;
    private String health;

    /**
     * new constructor with new values - char sex, string health (health status of recruit), surname
     */
    public Person(int age, String name, String surname, int height, char sex, String health) throws InvalidNameSurnameException {
        this.age = age;
        this.name = name.trim();
        this.surname = surname.trim();
        this.height = height;
        this.sex = sex;
        this.health = health;
        stringChanger();
    }

    public Person() {

    }

    public Person(int age, String name, int height) {
        this(age, name);
        this.height = height;
    }

    public Person(int age, String name) {
        this();
        this.height = 180;
        this.age = age;
        this.name = name;
    }

    public void info() {
        Random random = new Random();
        if (random.nextInt(40) < 20) {
            System.out.println("Hello, my name is " + name);
        } else {
            secureInfo();
        }
        System.out.println("I am living in " + address.toString());
    }

    private void secureInfo() {
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old");
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private void stringChanger() throws InvalidNameSurnameException {
        name = this.name.substring(0, 1).toUpperCase() + this.name.substring(1).toLowerCase();
        surname = this.surname.substring(0, 1).toUpperCase() + this.surname.substring(1).toLowerCase();
        if (name.contains(" ") || surname.contains(" ")) {
            throw new InvalidNameSurnameException("В имени/фамилии присутствует пробел!");
        }
    }

}
