
// Вычислить n-ное треугольное число (сумма чисел от 1 до n) и n!

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = iScanner.nextInt();
        iScanner.close();
        
        int sum;
        sum = n*(n+1)/2;        
        System.out.printf("Сумма чисел от 1 до " + n + " равна: %s\n", sum); 
        
        int factorial = 1;
        if (n == 0 && n == 1) {
            factorial = 1;
        } else {
            for (int i = 2; i <= n; i++) {
            factorial *=i;
            }
        }
        System.out.printf("Факториал числа " + n + " равен: %s\n", factorial); 
    }
}
