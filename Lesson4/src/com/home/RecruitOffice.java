package com.home;

import com.home.model.Address;
import com.home.model.Person;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RecruitOffice {
    PersonRegistry registry;
    MilitaryBase militaryBase = new MilitaryBase(this);

    private String country;
    private String city;
    private String recruitName;
    public List<Person> personListHealth;

    int getSize;


    public RecruitOffice(MilitaryBase militaryBase) {
        this.militaryBase = militaryBase;
    }


    public RecruitOffice(PersonRegistry registry) {
        this.registry = registry;
    }

    public List<Person> personListHealth() {

        return personListHealth;
    }

    public List<Person> getHealthyPeople() {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = registry.getPeople(new Address(country, city));
        personListHealth = new LinkedList<>();
        for (Person person : personList) {
            int age = person.getAge();
            char sex = person.getSex();
            if (sex == 'm') {
                if (age >= 18 && age <= 27) {
                    System.out.println(person.getName());
                    personListHealth.add(person);
                }
            }
        }
        System.out.println("Чтобы узнать состояние здоровья призывника, введите его имя: ");
        recruitName = scanner.nextLine();
        personListHealth = registry.getPeople(new Address(country, city));
        for (Person person : personListHealth) {
            if (recruitName.equals(person.getName())) {
                System.out.println(person.getHealth());
            }
        }
        System.out.println("Список годных к военной службе:");
        for (int i = 0; i < personListHealth.size(); i++) {
            int age = personListHealth.get(i).getAge();
            char sex = personListHealth.get(i).getSex();
            if (sex == 'm') {
                if (age >= 18 && age <= 27) {
                    System.out.println(personListHealth.get(i).getName() + " " + personListHealth.get(i).getSurname());
                }
            }

        }
        return personListHealth;
    }

    void gotoarmy() throws InvalidCountryNameException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа поиска призывников.");
        System.out.println("Введите страну поиска (Belarus): ");
        country = scanner.nextLine();
        if (!country.equals("Belarus")) {
            throw new InvalidCountryNameException("Ошибка ввода данных.Попробуйте ещё раз.");
        }
        if (country.equals("Belarus")) {
            System.out.println("Введите город поиска (Minsk или Vitebsk): ");
            city = scanner.nextLine();
            System.out.println("Фильтр. Cтрана: " + country + ". Город: " + city + ".");
            System.out.println("Список годных к срочной военной службе (имена):");
            getHealthyPeople();
        }
    }

    void getFreeSizeofBases() {
        getSize = militaryBase.getSize();
        System.out.println("Военкомат: необходимо еще пополнить: " + getSize);
    }

    void addRecruitsToBase() {
        System.out.println("Военкомат добавил " + getSize + " призывников");
        switch (getSize) {
            case 1:
                militaryBase.getBaseStaff().add(personListHealth.get(1));
                break;
            case 2:
                militaryBase.getBaseStaff().add(personListHealth.get(1));
                militaryBase.getBaseStaff().add(personListHealth.get(2));
                break;
            case 3:
                militaryBase.getBaseStaff().add(personListHealth.get(1));
                militaryBase.getBaseStaff().add(personListHealth.get(2));
                militaryBase.getBaseStaff().add(personListHealth.get(3));
                break;
            case 4:
                militaryBase.getBaseStaff().add(personListHealth.get(1));
                militaryBase.getBaseStaff().add(personListHealth.get(2));
                militaryBase.getBaseStaff().add(personListHealth.get(3));
                militaryBase.getBaseStaff().add(personListHealth.get(4));
                break;
        }
        System.out.println("Новый состав военной части:");
        for (int a = 0; a < militaryBase.getBaseStaff().size(); a++) {
            System.out.println(militaryBase.getBaseStaff().get(a).getName() + " " + militaryBase.getBaseStaff().get(a).getSurname());
        }
    }

}




