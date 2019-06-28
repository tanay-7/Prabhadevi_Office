package com.example.demotk.TemplateDesignPattern;

public class AudiMain {
    public static void main(String[] a) {
        AbstractAudiCarManufacturer C1 = new Customer_1();
        AbstractAudiCarManufacturer C2 = new Customer_2();
        System.out.println("-------Customer_1-------\n"+C1.color());
        System.out.println(C1.rpm());
        System.out.println("-------Customer_2-------\n"+C2.color());
        System.out.println(C2.rpm());
    }
}
