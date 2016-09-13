package com.hust.grid.leesf.main;

/**
 * Created by LEESF on 2016/9/9.
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 1, 3, 10, 10, 14, 12, 43, 100, 105};
        heapSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void heapSort(int[] array) {
        // 从最后一个具有子节点的节点从后往前构建堆，构建堆的范围是从i - (array.length - 1)
        for (int i = array.length / 2 - 1; i >= 0; i--)
            heapAdjust(array, i, array.length - 1);
        // 将第一个元素与最后一个元素相互交换
        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            // 再次调整
            heapAdjust(array, 0, i - 1);
        }
    }

    public static void heapAdjust(int[] array, int start, int end) {
        int key = array[start];
        for (int i = 2 * start + 1; i <= end; i = i * 2 + 1) {
            if ((i < end) && (array[i] < array[i + 1]))
                i++;
            if (key >= array[i])
                break;
            array[start] = array[i];
            start = i;
        }
        array[start] = key;
    }
}
