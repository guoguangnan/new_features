package com.test;

import com.bean.Person;

import java.util.Arrays;
import java.util.List;


/**
 * foreach的使用
 * create by guoguangnan 2017-12-25
 */
public class ListForEach
{
    /**
     * 主方法
     * @param args
     */
    public static void main(String[] args)
    {
       List<Person> list= PersonList.getPersonList();
        // 循环输出
        list.forEach(p->{
            System.out.println(p.getPersonId()+" "+p.getPersonName()+" "+p.getPersonAge());
        });
    }
}
