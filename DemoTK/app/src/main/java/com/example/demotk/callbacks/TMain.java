package com.example.demotk.callbacks;

import java.util.*;

public class TMain {
    public static void main(String a[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your state: ");
        String state = sc.next();

        Class c = Class.forName(state);

        Taxes t = (Taxes) c.newInstance();

        CalculateTax(t, state);
    }

    static void CalculateTax(Taxes t, String state) {
        System.out.println("Total tax for " + state + " is " + +10 * t.stateTax());
    }
}
