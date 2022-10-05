package ru.mirea.task4;

public class Ball {
    double x = 0.0;
    double y = 0.0;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {
    }

    public double getx() {
        return x;
    }

    public void setx(double x) {
        this.x = x;
    }

    public double gety() {
        return y;
    }

    public void sety(double y) {
        this.y = y;
    }

    public void setxy(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "Ball{" + "x=" + x + ", y=" + y + '}';
    }
}
