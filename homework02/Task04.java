import java.util.Scanner;
import java.io.FileWriter;

public class Task04 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        double res = 0;

        System.out.print("Введите первое число: ");
        double number1 = iScanner.nextDouble();

        System.out.print("\nВведите операцию (+, -, *, /): ");
        char operation = iScanner.next().charAt(0);

        System.out.print("\nВведите второе число: ");
        double number2 = iScanner.nextDouble();

        iScanner.close();

        switch (operation) {
            case '+':
                res = number1 + number2;
                break;
            case '-':
                res = number1 - number2;
                break;
            case '*':
                res = number1 * number2;
                break;
            case '/':
                if (number2 == 0)
                    System.out.println("На ноль делить нельзя!");
                else
                    res = number1 / number2;
                break;
            default:
                return;
        }
        WriteToFile(res);
        System.out.printf("\nРезультат : %s\n", res);
    }       
    static void WriteToFile(Double res) {                                           
        try (FileWriter f = new FileWriter("logTask04.txt", true)) {
            f.write(res.toString());
            f.write("\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}