/*
  Реализуйте очередь с помощью LinkedList со следующими методами:
• enqueue() — помещает элемент в конец очереди,
• dequeue() — возвращает первый элемент из очереди и удаляет его,
• first()   — возвращает первый элемент из очереди, не удаляя.
 */
package homework04;

import java.util.LinkedList;

public class Task02 {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(ll, getRandomNumber());
        }
        System.out.println("Созданный LinkedList: " + ll);
        System.out.println("Первый элемент в очереди: " + dequeue(ll));
        System.out.println("Удалили первый элемент в очереди: " + ll);
        System.out.println("Новый первый элемент в очереди: " + first(ll));
        System.out.println();
    }

    public static void enqueue(LinkedList<Integer> ll, int item) {
        ll.addLast(item);
    }

    public static int dequeue(LinkedList<Integer> ll) {
        int num = ll.get(0);
        ll.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> ll) {
        int num = ll.get(0);
        return num;
    }

    public static int getRandomNumber() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
