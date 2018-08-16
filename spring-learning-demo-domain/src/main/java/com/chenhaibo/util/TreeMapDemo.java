package com.chenhaibo.util;

import java.util.*;

/**
 * @Author: chenhaibo
 * @Description:
 * @Date: Created in 10:32 2018/8/16
 */
public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "a");
        treeMap.put(2, "b");
        treeMap.put(3, "c");

        //返回firstEntry
        System.out.println(treeMap.firstEntry().getValue());
        //返回maxKey  且  maxKey < 3
        System.out.println(treeMap.lowerKey(3));
        //返回minKey  且 minKey  > 1
        System.out.println(treeMap.higherKey(1));
        SortedMap<Integer, String> headMap = treeMap.headMap(3);
        SortedMap<Integer, String> subMap = treeMap.subMap(2, 3);
        for (Map.Entry<Integer, String> entry : headMap.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        Set<Map.Entry<Integer, String>> set = headMap.entrySet();
        Iterator<Map.Entry<Integer, String>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        for (Map.Entry<Integer, String> entry : subMap.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}
