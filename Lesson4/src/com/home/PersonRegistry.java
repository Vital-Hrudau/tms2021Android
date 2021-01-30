package com.home;

import com.home.model.Address;
import com.home.model.Person;

import java.util.LinkedList;
import java.util.List;

public class PersonRegistry {
    private Person[] citizens;

    public PersonRegistry(Person[] citizens) {
        this.citizens = citizens;
    }

    public PersonRegistry() {

    }

    public int countPeople(Address address) {
        int count = 0;
        for (Person person : citizens) {
            Address personsAddress = person.getAddress();
            if (personsAddress.getCountry().equals(address.getCountry())
                    && personsAddress.getCity().equals(address.getCity())) {
                count++;
            }
        }
        return count;
    }

    public int countPeople(String country) {
        int count = 0;
        for (Person person : citizens) {
            Address personsAddress = person.getAddress();
            if (personsAddress.getCountry().equals(country)) {
                count++;
            }
        }
        return count;
    }

    public List<Person> getPeople(Address address) {
        List<Person> people = new LinkedList<>();
        for (Person person : citizens) {
            Address personsAddress = person.getAddress();
            if (personsAddress.getCountry().equals(address.getCountry())
                    && personsAddress.getCity().equals(address.getCity())) {
                people.add(person);
            }
        }
        return people;
    }

    /**
     * Show good recruits to army (not use)
     */
    public List<Person> getHealthyPeople() {
        List<Person> peoplehp = new LinkedList<>();
        for (Person person : citizens) {
            int age = person.getAge();
            char sex = person.getSex();
            if (sex == 'm') {
                if (age >= 18 && age <= 27) {
                    peoplehp.add(person);
                }
            }
        }
        return peoplehp;
    }


}
