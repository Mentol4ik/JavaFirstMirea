package ru.mirea.task5;

import java.util.Scanner;
public class Dog {
    private String poroda;
    private String raskraska;
    public Dog(){}
    public Dog(String nov, String  mat){
        this.poroda = nov;
        this.raskraska=  mat;
    }
    public String isporodyastaya() {
        return poroda;
    }
    public void setporoda(String poroda) {
        this.poroda = poroda;
    }
    public String getraskraska() {
        return raskraska;
    }
    public void setraskraska(String raskraska) {
        this.raskraska = raskraska;
    }

}