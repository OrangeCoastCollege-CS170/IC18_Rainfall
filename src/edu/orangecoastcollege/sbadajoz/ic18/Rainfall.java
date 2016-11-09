package edu.orangecoastcollege.sbadajoz.ic18;
/*
Badajoz, Seve
CS A170
November 2, 2016

IC18
*/


import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Rainfall {
    public static void main(String[] args) {
        HashMap<String, Double> rainfall = new HashMap<>();
        rainfall.put("January", 0.0);
        rainfall.put("Febuary", 0.0);
        rainfall.put("March", 0.0);
        rainfall.put("April", 0.0);
        rainfall.put("May", 0.0);
        rainfall.put("June", 0.0);
        rainfall.put("July", 0.0);
        rainfall.put("August", 0.0);
        rainfall.put("September", 0.0);
        rainfall.put("October", 0.0);
        rainfall.put("November", 0.0);
        rainfall.put("December", 0.0);
        
        Scanner input = new Scanner(System.in);
        DecimalFormat twoDP = new DecimalFormat("#.0#");
        
        double total = 0.0, avg, max = Double.MIN_VALUE, min = Double.MAX_VALUE;
        
        
        for(Entry<String, Double> month: rainfall.entrySet()){
            System.out.print("Enter rainfall amount (in inches) for " + month.getKey() + ": ");
            double temp = input.nextDouble();
            rainfall.put(month.getKey(), temp);
        }
        input.close();
        for (double rain : rainfall.values()) {
            if (rain > max) max = rain;
            if (rain < min) min = rain;
            total += rain;               
        }
        avg = total/rainfall.size();
        
        System.out.println("Total Rainfall for the Year (in inches): " + twoDP.format(total));
        System.out.println("Average Rainfall for the Year (in inches): " + twoDP.format(avg));
        System.out.println("Minimum Monthly Rainfall (in inches): " + min);
        System.out.println("Maximum Monthly Rainfall (in inches): " + max);
    }
}
