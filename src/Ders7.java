import java.util.Scanner;
public class Ders7 {

    // Dərs 7 - Verilmiş ədədi tərsinə çevirən metod yaz.

    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Ədədi daxil edin: ");
        int num = scr.nextInt();

        int result = reverse(num);
        System.out.println("Tərsi: " + result);
    }


}
