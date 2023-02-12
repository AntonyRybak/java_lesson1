import java.util.Scanner;
 
public class task3 {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int first = Integer.parseInt(str);
 
        System.out.print("Введите второе число: ");
        Scanner scan1 = new Scanner(System.in);
        String str1 = scan.next();
        int second = Integer.parseInt(str1);
 
        System.out.print("Выберите действие:\n 1 - сложение\n 2 - вычетание\n 3 - умножение\n 4 - деление\n ");
        Scanner scan2 = new Scanner(System.in);
        String str2 = scan.next();
        int action = Integer.parseInt(str2);
        scan.close();
        scan1.close();
        scan2.close();
        if (action == 1) {
            System.out.println("Сумма чисел " + first + " и " + second + " = " + sum(first, second));
        }
        else if (action == 2){
            System.out.println("Разность чисел " + first + " и " + second + " = " + sub(first, second));
        }
        else if (action == 3){
            System.out.println("Произведение чисел " + first + " и " + second + " = " + mult(first, second));
        }
        else if (action == 4){
            System.out.println("Деление чисел " + first + " и " + second + " = " + div(first, second));
        }
        else {
            System.out.println("Не корректный ввод");
        }
    }
 
    public static int sum(int a, int b) {
        return a + b;
    }
 
    public static int sub(int a, int b) {
        return a - b;
    }
 
    public static int mult(int a, int b) {
        return a * b;
    }
 
    public static int div(int a, int b) {
        return a / b;
    }
}