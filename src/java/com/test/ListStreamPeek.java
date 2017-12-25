package com.test;

import java.util.Arrays;
import java.util.List;


public class ListStreamPeek
{
    public static void main(String[] args)
    {

        List<Integer> nums = Arrays.asList(1,1,null,2,3,4,null,5,6,7,8,9,10);

        int sum = nums.stream()
                      .filter(num -> num != null)  // 过滤不为空的 1,1,2,3,4,5,6,7,8,9,10
                      .distinct()   // 过滤重复的 1,2,3,4,5,6,7,8,9,10
                      .mapToInt(num -> num * 2) //每一个数据都乘2  2,4,6,8,10,12,14,16,18,20
                      .peek(System.out::println)  //打印skip 2个的内容  打印limit4个的内容
                      .skip(2)   //移除前两个（2，4）  6,8,10,12,14,16,18,20
                      .limit(4)  //保留四个 6,8,10,12
                      .sum(); //累加

        System.out.println("sum is:"+ sum);
    }
}
