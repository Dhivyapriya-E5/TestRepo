import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 10 integers to fill the array:");
        for (int i = 0; i < 10; i++) {
            array[i] = in.nextInt();
        }

        System.out.print("Prime numbers in the array: ");
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int j = 2; j * j <= num; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}
