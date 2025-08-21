import java.util.Scanner;
import java.util.Arrays;

class Bsearch {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = h.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements (sorted for binary search):");
        for(int i = 0; i < n; i++) {
            arr[i] = h.nextInt();
        }
        System.out.print("Enter key to search: ");
        int key = h.nextInt();

        int result = Arrays.binarySearch(arr, key);
        System.out.println(result);
        }
        }
