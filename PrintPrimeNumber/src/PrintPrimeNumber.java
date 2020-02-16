import java.util.Scanner;
public class PrintPrimeNumber {
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
        System.out.println("Enter the quantity: ");
        int number = sc.nextInt();
        int count = 0;
        int N = 2;
        while (count < number) {
            if (CheckPrime(N)) {
                System.out.print(N + ", ");
                count++;
            }
            N++;
        }
    }
}



