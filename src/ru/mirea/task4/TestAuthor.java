package ru.mirea.task4;
import java.io.IOException;
import java.util.Scanner;
import java.io.InputStream;
public class TestAuthor {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name= input.nextLine();
        String email =input.nextLine();
        int kod=input.nextInt();
        char gender = (char) kod;
        Author test = new Author(name,email,gender);
        System.out.println("Все Успешно!");
    }
}

