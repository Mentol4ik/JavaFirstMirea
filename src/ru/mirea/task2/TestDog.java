package ru.mirea.task2;

public class TestDog {
    private static Dog[] dogKennel = new Dog[10];
    private static int countDog = 0;

    public static void addDog(String name, int age)
    {
        dogKennel[countDog] = new Dog(name, age);
        countDog++;
    }

    public static void main(String[] args) {
        addDog("Степаныч", 5);
        addDog("Арес", 2);
        addDog("Тугрик", 7);

        for (int i = 1; i <= 3; i++) {
            System.out.println(dogKennel[i - 1]);
        }
        System.out.println("Перевод у Степаныча  = " + dogKennel[2].ageConverter());
    }
}
