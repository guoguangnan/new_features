package com.test;

import com.bean.Person;

import java.util.ArrayList;
import java.util.List;


public class PersonList {

    public static List<Person> getPersonList() {

        List<Person> list  = new ArrayList<>();

        Person p1 = new Person();
        p1.setPersonId(1L);
        p1.setPersonName("Jack");
        p1.setPersonAge(22);

        Person p2 = new Person();
        p2.setPersonId(2L);
        p2.setPersonName("Erick");
        p2.setPersonAge(10);

        Person p3 = new Person();
        p3.setPersonId(3L);
        p3.setPersonName("Jim");
        p3.setPersonAge(22);

        Person p4 = new Person();
        p4.setPersonId(4L);
        p4.setPersonName("Tom");
        p4.setPersonAge(28);

        Person p5 = new Person();
        p5.setPersonId(5L);
        p5.setPersonName("Lucy");
        p5.setPersonAge(18);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        return list;
    }
}
