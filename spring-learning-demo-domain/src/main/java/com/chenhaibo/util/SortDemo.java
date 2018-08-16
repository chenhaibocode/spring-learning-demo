package com.chenhaibo.util;

/**
 * @Author: chenhaibo
 * @Description:
 * @Date: Created in 17:33 2018/8/16
 */
public class SortDemo {
    public static void main(String[] args) {
        int[] array = {1,3,2,45,6};
        for(int i =0; i < array.length; i ++) {
            for(int j=0; j < array.length -1 -i; j ++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for(int i : array) {
            System.out.println(i);
        }
    }
}
