import java.util.Scanner;

public class Ders5 {

    // Dərs 5 - Verilmiş ədədin rəqəmlərini toplayan metod yaz.

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Ədədi daxil edin: ");
        int number = scr.nextInt();

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        System.out.println("Rəqəmlərin cəmi: " + sum);
    }


}
