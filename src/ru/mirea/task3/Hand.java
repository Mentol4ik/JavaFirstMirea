package ru.mirea.task3;
import java.util.Scanner;
public class Hand {
    Scanner input = new Scanner(System.in);
    int dlina;
    int shirina;
    public Hand()
    {
        System.out.print("Введите длину нашей руки: ");
        dlina = input.nextInt();
        System.out.print("Введите ширину нашей руки: ");
        shirina = input.nextInt();
        this.dlina = dlina;
        this.shirina = shirina;
        dlinanashirinu();
    }

    public int getdlina() {
        return this.dlina;
    }

    public void setdlina(int dlina) {
        this.dlina = dlina;
    }

    public int getshirina() {
        return this.shirina;
    }

    public void setshirina(int shirina) {
        this.shirina = shirina;
    }
    public void dlinanashirinu() {
        System.out.print("Ширина на длину = ");
        System.out.println(shirina*dlina);
    }
}
