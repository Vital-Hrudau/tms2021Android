package com.home;

import com.home.model.Person;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MilitaryBase {
    private int recruitSizeMax = 8;



    private int recruitSize;
    private String recruit;
    private List<Person> baseStaff = new LinkedList<>();
    private int size;

    RecruitOffice recruitOffice;
    public void setRecruitSize(int recruitSize) {
        this.recruitSize = recruitSize;
    }
    public int getRecruitSize() {
        return recruitSize;
    }

    public List<Person> getBaseStaff() {
        return baseStaff;
    }

    public MilitaryBase(RecruitOffice recruitOffice) {
        this.recruitOffice = recruitOffice;

    }

    public MilitaryBase() {

    }


    public void getMilitaryBase() {
        System.out.println("Максимальное количество служащих в военной части: " + recruitSizeMax);
        addtoBase(size);
    }


    public int addtoBase(int size) {
        boolean order;
        if (recruitSize > recruitSizeMax) {
            System.out.println("Часть переполнена");
        } else {
            System.out.println("Внедрение призывника вручную.Введите имя призывника, которого Вы хотите добавить:");
            Scanner scanner = new Scanner(System.in);
            recruit = scanner.nextLine();
            for (int i = 0; i < recruitOffice.personListHealth.size(); i++) {
                if (recruit.equals(recruitOffice.personListHealth.get(i).getName())) {
                    baseStaff.add(recruitOffice.personListHealth.get(i));
                }
            }
            System.out.println("Состав военной части:");
            for (int c = 0; c < baseStaff.size(); c++) {
                System.out.println(baseStaff.get(c).getName());
            }
            recruitSize++;
            this.size = recruitSizeMax - recruitSize;
            System.out.println("Кол-во свободных мест в части: " + this.size);

        }
        return size;
    }

    public int getSize() {
        return this.size;
    }
    public void getRecruitsNameSurname() {
        System.out.println("Сортированный список служащих:");
        baseStaff.sort(Comparator.comparing(Person::getSurname));
        for (int i = 0; i < baseStaff.size(); i++) {
            System.out.println(baseStaff.get(i).getSurname() + " " + baseStaff.get(i).getName());
        }
    }
}
