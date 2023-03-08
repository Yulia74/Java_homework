
// Вывести все простые числа от 1 до 1000

public class Task02 {
   public static void main(String[] args) {
    boolean flag = true;    
    for (int number = 2; number <= 1000; number++) {
        for (int divider = 2; divider < number; divider++) {
            if (number % divider == 0){
                flag = false;
                break;
            }
        }
        if (flag == true)
        System.out.print(number + " ");
        else flag = true;                 // почему?
        }
    } 
}


