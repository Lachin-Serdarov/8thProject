public class Prj8 {
    // Dərs 1 - Verilmiş n ədədinin faktorialını hesablayan metod yaz.

    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Faktorial: " + factorial(n));
    }

        // Dərs 8 - Verilmiş ədədin neçə rəqəmdən ibarət olduğunu hesablayan metod yaz.

        // Dərs 9 - Verilmiş ədədin Armstrong ədədi olub-olmadığını yoxlayan metod yaz.



}
