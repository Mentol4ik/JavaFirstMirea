package ru.mirea.task3;
import java.util.Scanner;
public class Leg {
    Scanner input = new Scanner(System.in);
    int dlina;
    int shirina;
    public Leg()
    {
        System.out.print("Введите интелект нашего ума: ");
        dlina = input.nextInt();
        System.out.print("Введите радиус нашей головы: ");
        shirina = input.nextInt();
        this.dlina = dlina;
        this.shirina = shirina;
        dlinanashirinuvkvadrate();
    }
    public int getdlina() {
        return dlina;
    }
    public void setdlina(int intelect) {
        this.dlina = intelect;
    }

    public int getshirina() {
        return shirina;
    }
    public void setshirina(int shirina) {
        this.shirina = shirina;
    }
    public void dlinanashirinuvkvadrate() {
        System.out.print("Длина на ширину в квадрате = ");
        System.out.println(dlina * shirina *dlina *shirina);
    }
}
