import java.util.Scanner;
import java.util.Random;
public class ArrayMenu {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter an array size: ");
            int size = sc.nextInt();
            int array[] = createArray(size);

            System.out.println("Here is the array: ");
            for (int n : array){
                System.out.print(n +", ");
            }
            System.out.println("\n=====MENU=====");
            System.out.println("1. Find the minimum integer in the array.");
            System.out.println("2. Find the maximum integer in the array.");
            System.out.println("3. Find the average of the array and displays each element of the array differs from the average.");
            System.out.println("4. Find the sum of the odd and even numbers.");
            
            while(true){
            System.out.println("Select the option you want[1-4]:");
            int selection = sc.nextInt();
            switch(selection) {
                case 1:
                    findMin(array);
                    return;
                case 2:
                    findMax(array);
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

        public static int[] createArray(int size){
            int[] array = new int[size];
            Random rnd = new Random();
            for (int i = 0; i < size; i++){
                array[i] = rnd.nextInt(101);
            }

            return array;

        }




}
