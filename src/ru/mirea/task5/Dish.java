package ru.mirea.task5;

import java.util.Scanner;
public class Dish {
    private String novizna;
    private String material;
    private int kolichestvo;
    public Dish(){}
    public Dish(String nov, String  mat, int kol){
        this.novizna = nov;
        this.material=  mat;
        this.kolichestvo = kol;
    }
    public String isnovaya() {
        return novizna;
    }
    public void setnovaya(String novizna) {
        this.novizna = novizna;
    }
    public String getmaterial() {
        return material;
    }
    public void setmaterial(String material) {
        this.material = material;
    }
    public int getkolichestvo() {
        return kolichestvo;
    }
    public void setkolichestvo(int kolichestvo) {
        this.kolichestvo = kolichestvo;
    }
    public String getcolor() {
        return material;
    }
    public void setmcolor(String color) {
        this.material = material;
    }
}