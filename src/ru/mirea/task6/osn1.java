package ru.mirea.task6;

import java.util.Scanner;
public class osn1
{
    public static void main (String args [])
    {
        Scanner in = new Scanner(System.in);
        int x, y,xSpeed,ySpeed,radius;
        x = in.nextInt();
        y = in.nextInt();
        xSpeed = in.nextInt();
        ySpeed = in.nextInt();
        radius = in.nextInt();
        Moveable per1 = new MoveableCircle( x, y,xSpeed, ySpeed,radius);
        Moveable per2 = new MoveablePoint( x, y,xSpeed, ySpeed);
    }
}
