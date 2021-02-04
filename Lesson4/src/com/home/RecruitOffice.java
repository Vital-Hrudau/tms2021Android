package com.home;

import com.home.model.Address;
import com.home.model.Person;

import java.util.List;
import java.util.Scanner;

public class RecruitOffice {
    PersonRegistry registry;
    private String country;
    private String city;
    private String recruitName;

    public RecruitOffice(PersonRegistry registry) {
        this.registry = registry;
    }

    void getHealthyPeople() {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = registry.getPeople(new Address(country, city));
        for (Person person : personList) {
            int age = person.getAge();
            char sex = person.getSex();
            if (sex == 'm') {
                if (age >= 18 && age <= 27) {
                    System.out.println(person.getName());
                }
            }
        }
        System.out.println("Чтобы узнать состояние здоровья призывника, введите его имя: ");
        recruitName = scanner.nextLine();
        List<Person> personListHealth = registry.getPeople(new Address(country, city));
        for (Person person : personListHealth) {
            if (recruitName.equals(person.getName())) {
                System.out.println(person.getHealth());
            }
        }
    }

    void gotoarmy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа поиска призывников.");
        System.out.println("Введите страну поиска (Belarus): ");
        country = scanner.nextLine();
        if (!country.equals("Belarus")) {
            System.out.println("Ошибка ввода данных.Попробуйте ещё раз.");
            gotoarmy();
        }
        if (country.equals("Belarus")) {
            System.out.println("Введите город поиска (Minsk или Vitebsk): ");
            city = scanner.nextLine();
            System.out.println("Фильтр. Cтрана: " + country + ". Город: " + city + ".");
            System.out.println("Список годных к срочной военной службе:");
            getHealthyPeople();
        }
    }
}




