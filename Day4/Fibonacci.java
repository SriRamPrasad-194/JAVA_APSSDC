import java.io.*;
import java.util.Scanner;
class Fibonacci {
 public static void main(String[] args) {
     int count, num1 = 0, num2 = 1;
        System.out.println("How may numbers you want in the sequence:");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        scanner.close();
        System.out.print("Fibonacci Series of "+count+" numbers:");
        int i=1;
        while(i<=count)
        {
            System.out.print(num1+" ");
            int num3= num1 + num2;
            num1 = num2;
            num2 =num3;
            i++;
        }
    }
}