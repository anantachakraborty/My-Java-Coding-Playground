import java.util.Scanner;

public class PathFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String str = sc.next();
        int n = str.length();

        // Process each character
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            // Check if lowercase, convert to uppercase
            if (ch >= 'a' && ch <= 'z') {
                System.out.print((char) (ch - 32));
            } else {
                // Move to a new line and convert uppercase to lowercase
                System.out.println();
                System.out.print((char) (ch + 32));
            }
        }

        sc.close();
    }
}

// for input oneTwoThree output should be-
// ONE
// tWO
// tHREE