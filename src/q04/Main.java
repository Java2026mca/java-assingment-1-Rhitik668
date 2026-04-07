import java.util.Scanner;

public class q04 {

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    static boolean isPerfect(int num) {
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

        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();

            if (isPerfect(n)) {
                System.out.println("Perfect");
            } else if (isPrime(n)) {
                System.out.println("Prime");
            } else {
                System.out.println("Neither");
            }
        }

        sc.close();
    }
}
