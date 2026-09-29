import java.util.Scanner;

public class Ders6 {

    // Dərs 6 - base ədədini exponent dərəcəsinə yüksəldən öz metodunu yaz (Math.pow istifadə etmədən).

    public static int power(int a, int b) {
        int result = 1;

        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Base ədəd daxil edin: ");

        int a = scr.nextInt();

        System.out.println("Exponent ədəd daxil edin: ");

        int b = scr.nextInt();

        int result = power(a, b);
        System.out.println(a + "^" + b + " = " + result);
    }


}
