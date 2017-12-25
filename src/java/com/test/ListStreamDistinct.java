package com.test;

import com.bean.Person;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;


public class ListStreamDistinct
{

    /**
     * 去重
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c","a").stream().distinct().collect(toList());

        list.forEach(s->{
            System.out.println(s);
        });
    }
}
