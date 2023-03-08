package prime;

public class Prime {
    public static void main(String[] args) {
        int i, j;
        boolean isPrime;

        System.out.println("Prime numbers less than 100:");

        // Kiểm tra các số từ 2 đến 100
        for (i = 2; i < 100; i++) {
            isPrime = true;

            // Kiểm tra xem số i có phải là số nguyên tố không
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Nếu số i là số nguyên tố, in nó ra màn hình
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
