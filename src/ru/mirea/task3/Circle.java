package ru.mirea.task3;

public class Circle {
    String name;
    double radius;
    double diametr;
    double ploshad;
    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return radius;
    }

    public void setAge(double radius) {
        this.radius = radius;
    }

    public double diametrConverter()
    {
        return this.radius * 2;
    }
    public double ploshad()
    {
        return this.radius * this.radius * 3.14;
    }

    public String informacia()
    {
        return "Название круга" + name + '\'' + ", radius=" + radius + '}';
    }
}
