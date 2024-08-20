package javaproject2;
import java.util.Scanner;

public class CountingDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();
        int digitCount = countDigits(number);
        System.out.println("The number of digits in " + number + " is: " + digitCount);
    }
    public static int countDigits(int num) {
        num = Math.abs(num);
        return Integer.toString(num).length();
    }
}
