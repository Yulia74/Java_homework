/*
 *  Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
 *  что 1 человек может иметь несколько телефонов.
 */

package homework05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task01 {

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();
        addNumber("Ваня Козлов", 123, phoneBook);
        addNumber("Петя Чесноков", 1234, phoneBook);
        addNumber("Ваня Козлов", 546585, phoneBook);
        addNumber("Евгений Сидоров", 8956477, phoneBook);
        addNumber("Маша Петрова", 12356233, phoneBook);
        addNumber("Петя Чесноков", 787897, phoneBook);
        printBook(phoneBook);
    }
    
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) { // Метод, добавляющий номера в книгу
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    
    public static void printBook(Map<String, ArrayList<Integer>> map) { // Метод, печатающий список контактов
        for (var item : map.entrySet()) {
            String phones = "";
            for (int el : item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}
