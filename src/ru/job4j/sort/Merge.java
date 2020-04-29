package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
         int[] rsl = new int[left.length + right.length];
         int leftIndex = 0;
         int rightIndex = 0;
         int index = 0;
         while (leftIndex < left.length && rightIndex < right.length) {
             if (left[leftIndex] <= right[rightIndex]) {
                 rsl[index++] = left[leftIndex++];
             } else {
                 rsl[index++] = right[rightIndex++];
             }
         }
            if (index == rsl.length) {
                return rsl;
            }
            while (leftIndex < left.length) {
                rsl[index++] = left[leftIndex++];
            }
            while (rightIndex < right.length) {
                rsl[index++] = right[rightIndex++];
            }

            return rsl;

    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4, 6}
        );
        System.out.println(Arrays.toString(rsl));
    }
}

