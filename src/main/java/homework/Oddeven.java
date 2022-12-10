package homework;

import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {
        System.out.println("Please enter the number for checking:");
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num % 2 == 0)
            System.out.println("The number is even.");
        else
            System.out.println("The number is odd.");
    }
}