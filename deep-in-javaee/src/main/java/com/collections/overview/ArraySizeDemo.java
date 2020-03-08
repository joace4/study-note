package com.collections.overview;

import java.util.*;
import java.util.stream.Stream;

public class ArraySizeDemo  {

    public static void main(String[] args) throws InterruptedException {
        int value = Integer.MAX_VALUE;

        System.out.println(value + 1);
        System.out.println(value + 1 == Integer.MIN_VALUE);
        System.out.println(value + 2 == Integer.MIN_VALUE + 1);
        // int 在 Java 只有 4 字节（32位）

        // OS 32位（4字节） 以及 64位（8字节）
        // long 和 double 是非线程安全的，两个4字节，高和低位
        // Java 中默认是没有正整数（无符号整数）
        // C unsigned int(size_t)

        // List<String> values = List.of(1);

        // values.size() == 0
        // values.size() < 1 好一点
//        List<Integer> i=Arrays.asList(1,2,3,4,5,6,7);
//        System.out.println("stream.forEach打印结果如下");
//        i.stream().forEach(System.out :: println);//固定结果 1234567
//        System.out.println("parallelStream.forEach打印结果如下");
//        i.parallelStream().forEach(System.out :: println);//每次的结果都不同
//        System.out.println("parallelStream.forEachOrdered打印结果如下");
//        i.parallelStream().forEachOrdered(System.out :: println);//结果同stream.forEach


}


}
