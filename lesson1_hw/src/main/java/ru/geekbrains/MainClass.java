package ru.geekbrains;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        task1and2();
    }

    private static void task1and2() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        System.out.println("Начальный массив: " + Arrays.toString(arr));
        System.out.println("Измененный массив: " + Arrays.toString(changeElements(1,7, arr)));
        System.out.println("ArrayList из массива: " + arrayToArrayList(arr));
    }

    public static int[] changeElements(int a, int b, int[] arr) {
        int x;
        x = arr[a];
        arr[a] = arr[b];
        arr[b] = x;
        return arr;
    }

    public static ArrayList<Integer> arrayToArrayList(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }
        return arrayList;
    }
}
