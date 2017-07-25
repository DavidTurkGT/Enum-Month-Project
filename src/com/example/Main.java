package com.example;

import com.example.common.*;

import java.util.Scanner;

/**
 * Created by David Turk on 7/25/17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a month and I'll tell you all the months that come after!");
        System.out.println("You can choose any of the following months:");
        Month[] allMonths = Month.getAllMonths();
        for(int i = 0; i < allMonths.length - 1; i++){
            System.out.print(allMonths[i].getEnglishName() + ", ");
        }
        System.out.println(allMonths[11].getEnglishName());
        System.out.println("Which month do you choose?");
        String choice = scanner.nextLine().toLowerCase();
        for(Month month : allMonths){
            if(month.getEnglishName().toLowerCase().equals(choice)){
                System.out.println("The successive months to " + month.getEnglishName() + " are:");
                for(Month nextMonth : month.getSuccessiveMonths() ){
                    System.out.println(nextMonth.getEnglishName());
                }
                return;
            }
        }
    }
}
