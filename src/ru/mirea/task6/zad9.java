package ru.mirea.task6;

import java.util.Arrays;
import java.util.Scanner;
class zad9 implements Printable
{
    public  String[] myArray  = new String[] {"Winter", "Spring", "Summer", "Autumn"};
    public zad9()
    {
        print();
    }
    public void print ()
    {
        System.out.println(toString());
    }

    @Override
    public String toString()
    {
        return "Devyatoe{" + "myArray=" + Arrays.toString(myArray) + '}'+"\n";
    }

    public static void main(String[] args)
    {
        zad9 per9 = new zad9();
    }
}
