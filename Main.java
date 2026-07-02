import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
              array[i] = input.nextInt();
       }

        System.out.print("Enter target value: ");
        int target = input.nextInt();        

        int linearIndex = Algorithms.linearSearch(array, target);

        Arrays.sort(array);

        int binaryIndex = Algorithms.binarySearch(array, target);

       System.out.println("\nLinear Search Result:");
       if (linearIndex != -1) {
           System.out.println("Target found at index " + linearIndex);
       } else {
           System.out.println("Target does not exist.");
       }

       System.out.println("\nBinary Search Result:");
       if (binaryIndex != -1) {
          System.out.println("Target found at index " + binaryIndex);
       } else {
          System.out.println("Target does not exist.");
       }
    }
}