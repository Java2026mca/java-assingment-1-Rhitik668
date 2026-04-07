import java.util.Scanner;

public class NumberClassifier {

    // Method to check prime number
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Method to check perfect number
    public static boolean isPerfect(int num) {
        if (num <= 1) return false;
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                sum += i;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean prime = isPrime(number);
        boolean perfect = isPerfect(number);

        if (prime && perfect) {
            System.out.println(number + " is BOTH Prime and Perfect.");
        } else if (prime) {
            System.out.println(number + " is a Prime number.");
        } else if (perfect) {
            System.out.println(number + " is a Perfect number.");
        } else {
            System.out.println(number + " is neither Prime nor Perfect.");
        }

        sc.close();
    }
}
