package ru.mirea.task3;
import java.util.Scanner;
public class TestCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        String name;
        System.out.println("Введите название нашей фигуры: ");
        name = input.nextLine();
        System.out.println("Введите радиус нашего круга: ");
        radius = input.nextDouble();
        Circle Krug = new Circle(name,radius);
        System.out.println("Название круга "+Krug.name);
        System.out.println("Радиус круга "+Krug.radius);
        System.out.println("Диаметр круга "+Krug.diametrConverter());
        System.out.println("Площадь круга "+Krug.ploshad());
    }
}
