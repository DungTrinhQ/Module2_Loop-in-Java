import java.util.Scanner;

public class PrintPrime {
    public static boolean CheckPrime(int N){
        if (N < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n = sc.nextInt();
        System.out.printf("All prime numbers less than% d are: \n", n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (CheckPrime(i)) {
                System.out.print(" " + i);
            }
        }
    }
}
