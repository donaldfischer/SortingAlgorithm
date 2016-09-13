package com.hust.grid.leesf.main;

/**
 * Created by LEESF on 2016/9/8.
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 1, 3, 10, 14, 12, 43, 100, 105};
        shellSort(array);
        for (int ele : array) {
            System.out.print(ele + " ");
        }
    }

    public static void shellSort(int[] array) {
        for (int step = 3; step >= 1; step = step - 2) {
            //sort(array, step);
            shellInsert(array, step);
        }
    }

    // 直觉写出的第一种方法
    public static void sort(int[] array, int step) {
        int index = 0;
        while (index < step) {
            for (int start = index + step; start < array.length; start = start + step) {
                int key = array[start];
                int i = start - step;
                for (; i >= 0 && key < array[i]; i = i - step) {
                    array[i + step] = array[i];
                }
                array[i + step] = key;
            }
            index++;
        }
    }

    // 第二种标准写法
    public static void shellInsert(int[] array, int step) {
        for (int j = step; j < array.length; j++) {
            int key = array[j];
            int i = j - step;
            for (; i >= 0 && key < array[i]; i = i - step) {
                array[i + step] = array[i];
            }
            array[i + step] = key;
        }
    }
}
