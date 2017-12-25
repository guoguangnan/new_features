package com.test;

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
       List<String> list= Arrays.asList("a","b","c");

       //java 1.7
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //或者
        for(String s:list){
            System.out.println(s);
        }


        // java 1.8
        list.forEach((String s)->{
            System.out.println(s);
        });
        //或者
        list.forEach(s->{
            System.out.println(s);
        });
    }
}
