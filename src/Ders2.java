public class Ders2 {
    // Dərs 2 - İlk n Fibonacci ədədini qaytaran metod yaz

    public static int[] fibonacci(int n) {
        int[] result = new int[n];

        if (n > 0) result[0] = 0;
        if (n > 1) result[1] = 1;

        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] fib = fibonacci(n);

        System.out.print("Fibonacci ardıcıllığı: ");
        for (int num : fib) {
            System.out.print(num + " ");
        }
    }
}
