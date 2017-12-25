package com.test;

import com.bean.Person;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;


/**
 * Filter 管道过滤 相当于 1.7的 循环+if
 * create by guoguangnan 2017-12-25
 */
public class ListStreamFilter {

    public static void main(String[] args) {

        //java 1.8
        List<Person> list = PersonList.getPersonList().stream().filter(person -> person.getPersonAge()<15).collect(
            toList());


        list.forEach(p ->{
            System.out.println(p.getPersonAge());
        });


    }
}
