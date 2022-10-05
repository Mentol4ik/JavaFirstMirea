package ru.mirea.task3;
import java.util.Scanner;
public class BookTest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String avtor = input.nextLine();
        String nazvanie = input.nextLine();
        int godnapisania = input.nextInt();
        Book kniga = new Book(avtor,nazvanie,godnapisania);
        System.out.println("Автор книги "+kniga.avtor);
        System.out.println("Название книги "+kniga.nazvanie);
        System.out.println("Год издания "+kniga.godnapisania);
        System.out.println("Полное название "+kniga.vivododnoystrokoy());
    }
}