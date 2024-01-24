import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        // Taking user input for the size of the square
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Variables for iteration
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                // Printing '*' for each column
                System.out.print("*");
                j++;
            }
            // Moving to the next line after printing a row
            System.out.println();
            i++;
        }
        // Closing the scanner
        sc.close();
    }
}
