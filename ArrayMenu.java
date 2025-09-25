
import java.util.Scanner;
import java.util.Random;

public class ArrayMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an array size: ");
        int size = sc.nextInt();
        sc.nextLine();
        int[] array = createArray(size);

        System.out.println("Here is the array: ");
        for (int n : array) {
            System.out.print(n + ", ");
        }
        System.out.println("\n=====MENU=====");
        System.out.println("1. Find the minimum integer in the array.");
        System.out.println("2. Find the maximum integer in the array.");
        System.out.println("3. Find the average of the array and displays each element of the array differs from the average.");
        System.out.println("4. Find the sum of the odd and even numbers.");

        while (true) {
            System.out.println("Select the option you want[1-4]:");
            int selection = sc.nextInt();
            sc.nextLine();
            switch (selection) {
                case 1:
                    System.out.println(findMin(array));
                    ;
                    return;
                case 2:
                    System.out.println(findMax(array));
                    ;
                    return;
                case 3:
                    findAverageDiff(array);
                    return;
                case 4:
                    findOddEvenSums(array);
                    return;
                default:
                    System.out.println("Invalid input, please try again");
            }
        }

    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rnd.nextInt(101);
        }

        return array;

    }

    public static int findMin(int[] arr) {
        int min_num = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min_num) {
                min_num = arr[i];
            }
        }

        return min_num;
    }

    public static int findMax(int[] arr) {
        int max_num = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_num) {
                max_num = arr[i];
            }
        }

        return max_num;
    }

    public static String findOddEvenSums(int[] arr) {
        int oddSums = 0;
        int evenSums = 0;
        String sums = "";

        for (int i : arr) {
            if (arr[i] % 2 == 0) {
                evenSums += i;
            }
            oddSums += i;
        }

        sums = "" + "Odd Sums: " + oddSums + "\nEven Sums: " + evenSums;

        return sums;
    }

}
