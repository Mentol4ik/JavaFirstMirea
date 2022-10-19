package ru.mirea.task5;

public class Akita extends Dog{
    private String color;
    public Akita(String nov, String mat){
        super(nov, mat);
    }
    public static void main(String[] args) {
        Akita posuda = new Akita("Редкая", "Оранжевая");
        System.out.println("Собака породистая?" + posuda.isporodyastaya() );
        System.out.println("A цвета какого?" + posuda.getraskraska());
    }
}