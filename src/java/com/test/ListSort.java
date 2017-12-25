package com.test;

import com.bean.Person;

import java.util.List;


/**
 * Sort 排序
 * create by guoguangnan 2017-12-25
 */
public class ListSort {
    /**
     * 主方法
     * @param args
     */
    public static void main(String[] args) {

        List<Person> list= PersonList.getPersonList();
        list.sort( ( e1, e2 ) -> e1.getPersonAge().compareTo(e2.getPersonAge()));

        list.forEach(p->{
            System.out.println(p.getPersonId()+" "+p.getPersonName()+" "+p.getPersonAge());
        });
    }
}
