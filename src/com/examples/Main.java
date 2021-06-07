package com.examples;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/
        Scanner myObj = new Scanner(System.in);

        int Fdegree;
        int Cdegree;
        double FtoC;
        double CtoF;

        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
            String Degreetype = myObj.nextLine();

        if (Degreetype.equals("c") || Degreetype.equals("f"))
            Degreetype = Degreetype.toUpperCase();

        System.out.println("Your choice: " + Degreetype);

        System.out.print("Please enter the Temperature in ");

        if (Degreetype.equals("C")){
            System.out.print(" Fahrenheit: ");
                Fdegree = myObj.nextInt();
            FtoC = ((Fdegree - 32) * 5) / 9;
            System.out.println("The temperature in Celsius is " + FtoC);
        }
        if (Degreetype.equals("F")){
            System.out.print(" Celsius");
                Cdegree = myObj.nextInt();
            CtoF = ((Cdegree * 9) / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + CtoF);
        }

        }
    }

