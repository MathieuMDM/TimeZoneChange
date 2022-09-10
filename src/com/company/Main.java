package com.company;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide the difference according to your time zone:");

        int zone = scanner.nextInt();

        LocalTime time = LocalTime.now();

        LocalTime time1 = time.plus(zone, ChronoUnit.HOURS);
        
        System.out.println("The current time is " + time1);

    }
}
