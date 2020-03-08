package com.collections.overview;

import java.util.*;

public class MapAndSetDemo {

    public static void main(String[] args) {

        // 通常 Set 是 Map Key 的实现，Set 底层运用 Map 实现
        // 比如 HashSet 底层运用了 HashMap
        // 散列码（Hash）索引
        Map<String, Object> map = new HashMap<String, Object>();
        NavigableSet<String> set ;
        // tab[1] hashCode = 9 key = 'a'
        // tab[2] hashCode = 10
        // tab[3] hashCode = 9 key = 'a'
        // TreeSet 底层运用了 TreeMap
        // 二叉树索引
        map = new TreeMap<>();
        set = new TreeSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        System.out.println(set.floor("2"));

        // Integer,String implements Comparable
        // 3 1 2 2
        // 3 1 => 1 3
        // (1 3) 2 => 1 2 3
        // (1 2 3) 2 => 1 2 2 3

    }


}
