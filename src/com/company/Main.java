package com.company;

public class Main {

    public static void main(String[] args) {
        promotionalProduct phone  = new promotionalProduct();
        promotionalProduct dress = new promotionalProduct("dress", 12, 25);
        promotionalProduct equipment = new promotionalProduct("Bosh", 42, 69,
                15, "equipment", 25);
        System.out.println(phone.toString());
        System.out.println(dress.toString());
        System.out.println(equipment.toString());
    }
}
