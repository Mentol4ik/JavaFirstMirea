package ru.mirea.task3;

public class Book {
    String avtor;
    String nazvanie;
    int godnapisania;
    public Book(String avtor,String nazvanie, int godnapisania)
    {
        this.avtor = avtor;
        this.nazvanie = nazvanie;
        this.godnapisania = godnapisania;
    }

    public String getAvvtor() {
        return avtor;
    }

    public void setAvvtor(String name) {
        this.avtor = avtor;
    }
    public String getnazvanie() {
        return nazvanie;
    }

    public void setgodnapisania(int godnapisania) {
        this.godnapisania = godnapisania;
    }
    public int getgodnapisania() {
        return godnapisania;
    }
    public String vivododnoystrokoy()
    {
        return avtor + " + " + nazvanie +" + " + godnapisania;
    }
}
