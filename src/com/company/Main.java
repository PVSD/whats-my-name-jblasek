package com.company;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);
        Scanner kbReaderstg = new Scanner(System.in);

        System.out.println("What is your first name?");

        String s = kbReader.next();

        System.out.println("What is your last name?");

        String s2 = kbReaderstg.next();

        System.out.println("Your full name is " + s + " " + s2 + ".");
    }
}
