package ru.mirea.task5;

public class Doberman extends Dog{
    private String color;
    public Doberman(String nov, String mat){
        super(nov, mat);
    }
    public static void main(String[] args) {
        Doberman posuda = new Doberman("Редкая", "Черная");
        System.out.println("Собака породистая?" + posuda.isporodyastaya() );
        System.out.println("A цвета какого?" + posuda.getraskraska());
    }
}