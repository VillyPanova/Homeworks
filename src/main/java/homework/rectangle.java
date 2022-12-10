package homework;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        System.out.println("Please enter the lenght of the rectangle:");
        Scanner scanner = new Scanner(System.in);
        int lenght = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter the width of the rectangle:");
        int widht = Integer.parseInt(scanner.nextLine());
        int perimeter = (2 * (lenght + widht));
        int area = lenght * widht;
        System.out.println("The perimeter of the rectangle is" + " " + perimeter);
    }
}