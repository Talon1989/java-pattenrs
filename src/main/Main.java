package main;

import pattern.builder.Nation;
import pattern.singleton.Preferences;

public class Main {

    public static void main(String[] args){
        System.out.println("working");
        Nation italy = new Nation.Builder("Italy").population(3L).build();
        System.out.println(italy);
        System.out.println(Preferences.getInstance());
    }

}
