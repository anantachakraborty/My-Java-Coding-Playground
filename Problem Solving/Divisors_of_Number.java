import java.util.Scanner;

public class Divisors_of_Number {
    void printDivisors(int n) {
        int i;

        for (i = 1; i * i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        // The above loop only prints divisors up to the square root of n.
        // To print all divisors, you can add the square root divisor separately.
        if (i * i == n) {
            System.out.println(i);
            i--;
        }

        for (; i >= 1; i--) {
            if (n % i == 0) {
                System.out.println(n / i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        Divisors_of_Number divisors = new Divisors_of_Number();
        divisors.printDivisors(n);
    }
}
