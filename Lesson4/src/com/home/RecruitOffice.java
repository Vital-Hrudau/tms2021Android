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
                    System.out.println(personListHealth.get(i).getName());
                }
            }

        }
        return personListHealth;
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

    void getFreeSizeofBases() {
        System.out.println("Военкомат: необходимо еще пополнить: ");
        getSize = militaryBase.getSize();
        System.out.println(getSize);

    }

}
/**
 * Расширить функционал военкомата
 * + При создании военкомата теперь передавать не только регистратуру,
 * но и массив (или список) военных частей, в которые военкомат будет распределять военных.
 * - Добавить метод который посчитает сколько призывников нужно собрать в этот раз
 * (сумма свободных мест во всех частях).
 * - Изменить метод военкомата getPeople (или getHealthyPeople, у каждого из вас по своему)
 * - после вычисления здоровых людей распределить их по частям любым удобным вам способом.
 * Если все части заполнены (призывников оказалось больше чем места в частях) - вывести соответствующее сообщение.
 * <p>
 * На данном этапе реализации допускать что один человек может служить в разных частях
 * (и если не выполнять задачу со звездочкой то допустить что одного и того же человека
 * можно дважды добавить в одну часть)
 */




