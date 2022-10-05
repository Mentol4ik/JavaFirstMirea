package ru.mirea.task4;
import java.io.IOException;
import java.util.Scanner;
import java.io.InputStream;
public class TestBall {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double x= input.nextDouble();
        double y =input.nextDouble();
        Ball test1 = new Ball(x,y);
        System.out.println("Все Успешно!");
    }
}
