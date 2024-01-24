import java.util.Scanner;

public class Check_Array_Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: Read the size of the array
        int n = sc.nextInt();
        int[] a = new int[n];

        // Input: Read array elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Check if the array is sorted
        boolean ans = isSorted(a, n);

        // Output: Print the result
        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Function to check if the array is sorted
    public static boolean isSorted(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            // If current element is less than the previous element, array is not sorted
            if (a[i] < a[i - 1]) {
                return false;
            }
        }
        // If no such pair is found, array is sorted
        return true;
    }
}
