package javaproject2;

public class Sum {
    public static void main(String[] args) { 
        int a = 8;
        int b = 10;
        int c = 4;
        int d = 6;       
        int sumAB = a + b;
        int sumCD = c + d;
        if (sumAB > sumCD) {
            System.out.println("The sum of a and b is greater than the sum of c and d.");
        }
    }
}
