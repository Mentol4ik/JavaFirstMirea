package ru.mirea.task5;

public class Glass extends Dish{
    private String color;
    public Glass(String nov, String mat, int kol,String color){
        super(nov, mat, kol);
        this.color=color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public static void main(String[] args) {
        Glass posuda = new Glass("Novaya", "Steklo", 4,"White");
        System.out.println("А посуда то новая?" + posuda.isnovaya());
        System.out.println("Посуда из какого материала?" + posuda.getmaterial());
        System.out.println("А сколько в наличии?" + posuda.getkolichestvo() );
        System.out.println("А цвет какой?" + posuda.getkolichestvo() );
    }
}