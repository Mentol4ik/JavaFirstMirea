package ru.mirea.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Array{
    public static int factorial(int k)
    {
        int i=0,sum=1;
        for(i=1;i<=k;i++)
            sum*=i;
        return sum;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] array=new int[10];
        for(int i=0;i<10;i++){
            array[i]=input.nextInt();
        }
        int j=0;
        int sum=0;
        while (j<10){
            sum+=array[j];
            j++;
        }
        j=0;
        System.out.print("array = ");
        do{
            System.out.print(array[j]+" ");
            j++;
        }
        while(j<10);
        System.out.println("\n"+sum);
        for(int i=1;i<11;i++){
            System.out.print(1./i+" ");
        }
        System.out.print("\n");
        for(int i=0;i<10;i++){
            array[i]=(int) (Math.random()*255);
            System.out.print(array[i]+" ");
        }
        System.out.print("\n");
        for(int i=0;i<10;i++){
            Arrays.sort(array);
            System.out.print(array[i]+" ");
        }
        System.out.print("\n");
        int u;
        System.out.print("Введите число для которого нужно найти интеграл: ");
        u=input.nextInt();
        System.out.print(factorial(u));
    }
}

