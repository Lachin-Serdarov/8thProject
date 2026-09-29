import java.util.Scanner;

public class Ders4 {

    // Dərs 4 - Verilmiş sözün palindrom olub-olmadığını yoxla

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Söz daxil edin: ");
        String input = scr.nextLine();

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        if (input.equals(reversed)) {
            System.out.println("Palindromdur");
        } else {
            System.out.println("Palindrom deyil");


        }
    }
}