package com.coaxys.hp;

public class Classroom {
    public static void main (String[] args) {
        Wilder hugo = new Wilder("Hugo");
        hugo.setAware(true);

        Wilder thomas = new Wilder("Thomas");

        System.out.println(hugo.whoAmI());
        System.out.println(thomas.whoAmI());
    }
}
