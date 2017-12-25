package com.test;

/**
 * AnyMatch 是否存在
 * create by guoguangnan 2017-12-25
 */
public class ListStreamAnyMatch {

    public static void main(String[] args) {
        // 是否存在一个 年龄等于10的
        boolean f = PersonList.getPersonList().stream().anyMatch(person -> person.getPersonAge()==10);
        System.out.println(f);
    }
}
