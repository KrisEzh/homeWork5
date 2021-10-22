package com.company;

import java.util.Arrays;

public class Main {

    private static int[][] matrix;
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        //homeTask1

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //homeTask2

        int[] dailySpending = {900, 100, 400, 500, 800, 300};
        int max = -1;
        for (int j : dailySpending) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        int min = dailySpending[0];
           for(int i = 1; i < dailySpending.length; i++) {
               if(dailySpending[i] < min) {
                   min = dailySpending[i];
               }
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
               break;
           }

         //homeTask3

        float all = 0f;
        for (float i : arr) {
            all += i;
        }
        float mothMiddleSpending = all / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + mothMiddleSpending + " рублей");

        //homeTask4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        String strRev = "";
        for(int i = reverseFullName.length-1; i >=0; i--) {
           strRev += reverseFullName[i]; }
           System.out.print(strRev);

        System.out.println();

       //homeTask5

        int[][] m = new int[3][3];
        for (int[] row : m) {
            for (int i = 0; i < m.length-1; i++)
            {
                for (int j = 0; j < m[0].length; j++) {
                    if ((i+j) % 2 == 0) m[i][j] = 1;
                    System.out.print(m[i][j] + " ");
                }
              System.out.println();


            }
    }

        //homeTask 6

        int [] numbers = {5, 4, 3, 2, 1};
        int [] numbers2 = new int [numbers.length]; {
        for(int i = numbers.length- 1; i >= 0; i--)
            numbers2[numbers.length-i-1] = numbers[i];
            System.out.println(Arrays.toString(numbers));
            System.out.println(Arrays.toString(numbers2)); }


        //homeTask7

        int [] a = {5, 8, 2, 3, 9};
        for(int i: a) {
            System.out.print(i + " "); }



} }


