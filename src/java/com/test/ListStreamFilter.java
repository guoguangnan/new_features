package com.test;

import com.bean.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;


/**
 * Filter 管道过滤 相当于 1.7的 循环+if
 * create by guoguangnan 2017-12-25
 */
public class ListStreamFilter {

    public static void main(String[] args) {

        // 将数组中年龄小于15的人 生成新的数组
        List<Person> list = PersonList.getPersonList().stream().filter(person -> person.getPersonAge()<15).collect(
            toList());

        list.forEach(p ->{
            System.out.println(p.getPersonAge());
        });

        //合并一起
        PersonList.getPersonList().stream().filter(person -> person.getPersonAge()<15).forEach(p->{
            //System.out.println(p.getPersonAge());
        });



        //如果判断条件比较多
        PersonList.getPersonList().stream().filter(p->matchPerson(p)).forEach(p->{
           //TODO
        });

    }


    private static boolean matchPerson(Person person) {

        return person.getPersonAge()>10|| "1".equals(person.getPersonId());

    }
}
