package com.company;

public class Main {

    public static void main(String[] args) {
        task1();task2();task3();
    }

    public static void task1() {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int i = 0; i < array.length; i++)
            if (array.length - 1 > i) {
                System.out.print(" " + array[i] + ",");
            } else {
                System.out.print(" " + array[i]);
            }
        System.out.println();


        double[] arrayDouble = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < arrayDouble.length; i++) {
            if (arrayDouble.length - 1 > i) {
                System.out.print(" " + arrayDouble[i] + ",");
            } else {
                System.out.print(" " + arrayDouble[i]);
            }
        }
        System.out.println();


        int[] arraySalary = new int[5];
        arraySalary[0] = 3;
        arraySalary[1] = 5;
        arraySalary[2] = 8;
        arraySalary[3] = 9;
        arraySalary[4] = 11;
        for (int i = 0; i < arraySalary.length; i++)
            if (arraySalary.length - 1 > i) {
                System.out.print(" " + arraySalary[i] + ",");
            } else {
                System.out.print(" " + arraySalary[i]);
            }
        System.out.println();


    }

    public static void task2() {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int i = array.length-1; i >= 0; i--)
            if (i == 0) {
                System.out.print(" " + array[i]);
            } else {
                System.out.print(" " + array[i] + ",");
            }
        System.out.println();

        double[] arrayDouble = new double[]{1.57, 7.654, 9.986};
        for (int y = arrayDouble.length -1; y >= 0; y--)
            if (y == 0) {
                System.out.print(" " + arrayDouble[y]);
            } else {
                System.out.print(" " + arrayDouble[y] + ",");
            }
        System.out.println();

        int[] arraySalary = new int[5];
        arraySalary[0] = 3;
        arraySalary[1] = 5;
        arraySalary[2] = 8;
        arraySalary[3] = 9;
        arraySalary[4] = 11;
        for (int o = arraySalary.length -1; o >= 0; o--)
            if (o == 0) {
                System.out.print(" " + arraySalary[o]);
            } else {
                System.out.print(" " + arraySalary[o] + ",");
            }
        System.out.println();


    }
    public static void task3() {
        int[] array = new int[3];
        array[0] = 3;
        array[1] = 7;
        array[2] = 11;
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 != 0)array[i]+=1;
        for (int y = 0; y < array.length; y++)
            if (array.length -1 > y){
                System.out.print(" " + array[y] + ",");
            }else {
                System.out.println(" " + array[y]);
            }

    }
}


