/*
 *  Пусть дан LinkedList с несколькими элементами.
 *  Реализуйте метод, который вернёт «перевёрнутый» список
 */

package homework04;

import java.util.LinkedList;
import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = createList(10);
        System.out.print("Cозданный LinkedList:    ");
        System.out.println(integerLinkedList);
        integerLinkedList = reverseList(integerLinkedList);
        System.out.print("Перевернутый LinkedList: ");
        System.out.println(integerLinkedList);
    }

    static LinkedList<Integer> createList(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.add(i + 1);
        }
        return linkedList;
    }

    static LinkedList<Integer> reverseList(LinkedList<Integer> linkedList) {
        LinkedList<Integer> newList = new LinkedList<>();
        while (linkedList.size() > 0) {
            newList.add(linkedList.pollLast());
        }
        return newList;
    }
}

// второй вариант решения задачи

class Task01a {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();
        rand_add_list(10, 100, lst);
        System.out.println("Исходный список:     " + lst);

        LinkedList<Integer> reverse_lst = new LinkedList<>();
        reverse_list(lst, reverse_lst);
        System.out.println("Перевернутый список: " + reverse_lst);

    }

    public static void rand_add_list(int count, int maxValue, LinkedList<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            list.add(rand.nextInt(maxValue));
        }
    }

    public static LinkedList<Integer> reverse_list(LinkedList<Integer> list, LinkedList<Integer> new_list) {
        for (int i = 0; i < list.size(); i++) {
            new_list.add(list.peekLast());
            list.removeLast();
            i--;
        }
        return new_list;
    }
}
