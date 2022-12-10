package homework;

import java.util.Scanner;

public class Homework2 {
    public static void main (String[] args){
        System.out.println("Please enter the first number:");
        Scanner scanner = new Scanner(System.in);
        int firstnumb = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter the second number:");
        int secnumb = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter the third number:");
        int thirdnumb = Integer.parseInt(scanner.nextLine());
        if (firstnumb>secnumb && firstnumb>thirdnumb){
            System.out.println(firstnumb + " is the largest number");}
        else if (secnumb>firstnumb && secnumb>thirdnumb){
            System.out.println(secnumb + " is the largest number");}
        else
            System.out.println(thirdnumb + " " + "is the largest number");


    }


}

