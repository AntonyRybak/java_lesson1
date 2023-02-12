public class task2 {
    public static void main(String[] args) {
        int a, b;
        boolean isPrime;
 
        for (a = 2; a < 1000; a++) {
            isPrime = true;
 
            for (b = 2; b <= a / b; b++)
                if ((a % b) == 0)
                    isPrime = false;
            if (isPrime)
                System.out.println(a + " простое число ");
        }
    }
}