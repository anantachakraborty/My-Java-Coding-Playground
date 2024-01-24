import java.util.Scanner;

public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Input value of k
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        // Call the kthSmallest function
        int result = kthSmallest(arr, 0, arr.length - 1, k);

        // Print the result
        System.out.println("The kth smallest element is: " + result);

        sc.close();
    }

    public static int kthSmallest(int[] arr, int l, int r, int k) {
        int temp = 0;

        // Your existing kthSmallest logic goes here
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr[k - 1];
    }
}
