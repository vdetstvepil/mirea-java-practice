package com.company;

import java.util.Locale;
import java.util.Scanner;

public class TestBall {

    public static void main(String[] args) {
        Ball b1 = new Ball("SuperBall", "Yellow", 5.0);
        Ball b2 = new Ball("ElasticBall", "Green", 9.0);
        Ball b3 = new Ball("LightBall", "Purple", 2.7);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        b3.setColor("Black-and-white");
        System.out.println("new color of " + b3.getModel() + " is " + b3.getColor());
    }
}
