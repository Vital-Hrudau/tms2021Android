package com.home;

import com.home.model.Address;
import com.home.model.Person;


public class Main {

    public static void main(String[] args) throws InvalidCountryNameException, javax.naming.InvalidNameException {
        PersonRegistry registry;
        Person konstantin = new Person(25, "kOnstantin", "Glebov", 179, 'm',
                "Повышенное давление, Склероз 2 ст.");
        Address konstantinsAddress = new Address("Belarus", "Minsk");
        konstantin.setAddress(konstantinsAddress);

        Person gleb = new Person(27, "Gleb", "Litvinov", 190, 'm', "Отклонений не выявлено");
        Address glebsAddress = new Address("Belarus", "Vitebsk");
        gleb.setAddress(glebsAddress);

        Person vadim = new Person(17, "Vadim", "Molchanov", 180, 'm', "Не годен по возрасту");
        Address vadimsAddress = new Address("Belarus", "Vitebsk");
        vadim.setAddress(vadimsAddress);

        Person oleg = new Person(20, "Oleg", "Borisov", 188, 'm', "Отклонений не выявлено");
        Address olegsAddress = new Address("Belarus", "Minsk");
        oleg.setAddress(olegsAddress);

        Person vito = new Person(24, "Vitaliy", "Grudov", 192, 'm',
                "Нарушения сердечного ритма 1 ст, повышенное давление");
        Address vitoAddress = new Address("Belarus", "Minsk");
        vito.setAddress(vitoAddress);

        Person sasha = new Person(33, "Aleksandr", "Aleksandrov", 193, 'm', "Не годен по возрасту");
        Address sashaAddress = new Address("Belarus", "Minsk");
        sasha.setAddress(sashaAddress);

        Person elvira = new Person(23, "Elvira", "Emilsanova", 170, 'f', "Девочка");
        Address elviraAddress = new Address("Russia", "Pyatigorsk");
        elvira.setAddress(elviraAddress);

        Person alena = new Person(22, "Alena", "Tuhachova", 174, 'f', "Девочка");
        Address alenaAddress = new Address("Belarus", "Polotsk");
        alena.setAddress(alenaAddress);

        Person vlad = new Person(23, "vlad", "Zarudski", 174, 'm', "Ожирение 2 ст.");
        Address vladAddress = new Address("Belarus", "Minsk");
        vlad.setAddress(vladAddress);

        Person michael = new Person(37, "Mihail", "Medvedski", 190, 'm', "Не годен по возрасту");
        Address michaelsAddress = new Address("Belarus", "Vitebsk");
        michael.setAddress(michaelsAddress);
        /**
         * new recruits of military bases:
         */
        Person evgeniy = new Person(22, "Evgeniy", "Colachev", 180, 'm', "Отклонений не выявлено");
        Address evgeniyAddress = new Address("Belarus", "Vitebsk");
        evgeniy.setAddress(evgeniyAddress);

        Person viktor = new Person(25, "Viktor", "Borov", 182, 'm', "Отклонений не выявлено");
        Address viktorAddress = new Address("Belarus", "Minsk");
        viktor.setAddress(viktorAddress);

        Person nikolay = new Person(25, "Nikolay", "Andreichenko", 192, 'm', "Отклонений не выявлено");
        Address nikolayAddress = new Address("Belarus", "Minsk");
        nikolay.setAddress(nikolayAddress);

        registry = new PersonRegistry(new Person[]{gleb, konstantin, oleg, vadim,
                vito, sasha, elvira, alena, vlad, michael, evgeniy, viktor, nikolay});

        RecruitOffice office = new RecruitOffice(registry);
        MilitaryBase militaryBase = office.militaryBase;
        registry.stringsControl();


        militaryBase.getBaseStaff().add(nikolay);
        militaryBase.getBaseStaff().add(viktor);
        militaryBase.getBaseStaff().add(evgeniy);
        militaryBase.setRecruitSize(3);


        try {
            office.gotoarmy();
        } catch (InvalidCountryNameException e) {
            e.printStackTrace();
        } finally {
            office.gotoarmy();
        }

        militaryBase.getMilitaryBase();
        office.getFreeSizeofBases();
        office.addRecruitsToBase();
        militaryBase.getRecruitsNameSurname();
    }


}
