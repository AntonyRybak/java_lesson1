import java.util.Scanner;
 
public class task1 {
    public static void main(String[] args) {
        System.out.print("Введите число n: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();
        int factorial = Integer.parseInt(str);
        System.out.println("Факториал числа " + factorial + " равен " + getFactorial(factorial));
 
    }
 
    public static int getFactorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * getFactorial(n - 1);
        }
    }
}
 
// import java.util.Scanner;
 
// public class task1 {
//     public static void main(String[] args) {
//         System.out.print("Введите число n: ");
//         Scanner scan = new Scanner(System.in);
//         String str = scan.next();
//         int triangle = Integer.parseInt(str);
//         System.out.println("n-ое треуголное число равно " + getTriangle(triangle));
//         scan.close();
 
//     }
 
//     public static int getTriangle(int n) {
//         int result = 0;
//         for (int index = 0; index <= n; index++) {
//             result = result + index;
//         }
//         return result;
        
//     }
 
// }