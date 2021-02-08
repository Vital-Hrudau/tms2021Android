package com.home;

import com.home.model.Person;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MilitaryBase {
    public int recruitSizeMax = 5;
    public int recruitSize;
    public String recruit;
    public List<Person> baseStaff = new LinkedList<>();

    RecruitOffice recruitOffice;

    public MilitaryBase(RecruitOffice recruitOffice) {
        this.recruitOffice = recruitOffice;

    }

    public void getMilitaryBase() {
        System.out.println("Максимальное количество служащих в военной части: " + recruitSizeMax);
        addtoBase();
    }

    public void addtoBase() {
        if (recruitSize > recruitSizeMax) {
            System.out.println("Часть переполнена");
        } else {
            System.out.println("Введите имя призывника, которого Вы хотите добавить:");
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
            int size = recruitSizeMax - recruitSize;
            System.out.println("Кол-во свободных мест в части: " + size);


        }
    }
}


/**
 * + При создании части нужно указать максимально количество служащих в военной части.
 * + Сделать возможным добавление в военную часть нового служащего
 * +(но если кол-во служащих уже максимальное - выводить сообщение что часть переполнена)
 * - ЗАДАЧА СО ЗВЕЗДОЧКОЙ: при добавлении служащего проверить не служит ли он уже в этой части
 * (совпадение по имени, росту, возрасту либо совпадение по ссылке),если служит - не добавлять дважды
 * + Сделать возможным получение информации о том сколько свободных мест есть в части
 * + Добавить метод который выведет всех служащих части.
 **/