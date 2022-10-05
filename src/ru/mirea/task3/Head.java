package ru.mirea.task3;
import java.util.Scanner;
public class Head {
    Scanner input = new Scanner(System.in);
    int intelect;
    double radius;
    public Head()
    {
        System.out.print("Введите интелект нашего ума: ");
        intelect = input.nextInt();
        System.out.print("Введите радиус нашей головы: ");
        radius = input.nextInt();
        this.intelect = intelect;
        this.radius = radius;
        intelectnardius();
    }
    public int getintelect() {
        return intelect;
    }
    public void setintelect(int intelect) {
        this.intelect = intelect;
    }

    public double getradius() {
        return radius;
    }
    public void setradius(double radius) {
        this.radius = radius;
    }
    public void intelectnardius() {
        System.out.print("Радиус на интелект = ");
        System.out.println(intelect * radius);
    }
}
