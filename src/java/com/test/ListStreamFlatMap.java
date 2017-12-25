package com.test;

import java.util.Arrays;
import java.util.stream.Stream;


/**
 * flatMap 把多维数组进行合并转换
 */
public class ListStreamFlatMap {

    public static void main(String[] args) {

        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);

        //Stream<String>
        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));

        stringStream.forEach(System.out::println);
    }
}
