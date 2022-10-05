package ru.mirea.task2;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
        {
            array[i] = input.nextInt();
        }
        int j = 0;
        int sum = 0;
        while (j < 10)
        {
            sum += array[j];
            j++;
        }
        j = 0;
        System.out.print("array = ");
        do {
            System.out.print(array[j] + " ");
            j++;
        } while (j < 10);
        System.out.println("\n" + sum);
    }
}