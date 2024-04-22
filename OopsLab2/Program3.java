package OopsLab2;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {1, 2}, {1, 2, 3, 4, 5}};
        System.out.println("Original data in the array:");
        printArray(array);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new data to replace the existing array elements:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Data in the array after scanning:");
        printArray(array);

        scanner.close();
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
