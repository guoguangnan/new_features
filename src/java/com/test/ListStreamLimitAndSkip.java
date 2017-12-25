package com.test;

import com.bean.Person;

import java.util.List;

import static java.util.stream.Collectors.toList;


/**
 * 截取
 */
public class ListStreamLimitAndSkip
{
    public static void main(String[] args) {
        // 截取前三个
        List<Person> limitList =  PersonList.getPersonList().stream().limit(3).collect(toList());

        limitList.forEach(person -> {
            System.out.println(person.getPersonName());
        });

        // 移除前三个保留剩下的
        List<Person> skipList =  PersonList.getPersonList().stream().skip(3).collect(toList());

        skipList.forEach(person -> {
            System.out.println(person.getPersonName());
        });

    }
}
