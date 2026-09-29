import java.util.Scanner;
public class Ders3 {
    // Dərs 3 - Verilmiş ədədin sadə (prime) olub-olmadığını yoxlayan metod yaz.
    static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Ədəd daxil edin: ");
        int number = scr.nextInt();;
        if (isPrime(number)) {
            System.out.println(number + " sadə ədəddir.");
        } else {
            System.out.println(number + " sadə deyil.");
        }
    }

}
