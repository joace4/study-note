package com.collections.advanced;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionRemoveDemo {

    public static void main(String[] args) {

        List<Integer> values = new ArrayList(List.of(1, 2, 3));

        // 常规做法
        Iterator<Integer> iterator = values.iterator();
        while (iterator.hasNext()) {
            iterator.next(); // 需要执行，调整游标
            iterator.remove();
        }

        values = new ArrayList(List.of(1, 2, 3));

        //　成功删除
        int size = values.size();
        for (int i = 0; i < size; i++) {
            Object value = values.get(0);
            values.remove(value);
            System.out.println(values.size());
        }

        values = new ArrayList(List.of(1, 2, 3));

        size = values.size();
        for (int i = 0; i < size; i++) {
            values.remove(0);
        }

        // 失败删除: for-each 语法  语法糖相当于调用 Itr#hasNext() 方法，
        // Itr 和 ArrayList  都维护一个 modCount（集合修改次数），调用外部List#remove() 导致 modCount 不相等
        values = new ArrayList(List.of(1, 2, 3));

        for (Integer value : values) {
            values.remove(value);
        }
    }
}
