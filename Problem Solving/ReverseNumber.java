import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        // Store the original number for display later
        int originalNum = num;
        int reversedNum = 0;

        // Loop to reverse the number
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        // After the loop, reversedNum will contain the reversed number.

        // Displaying the original and reversed numbers
        System.out.println("Original Number: " + originalNum);
        System.out.println("Reversed Number: " + reversedNum);
    }
}
