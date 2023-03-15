package homework03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа

public class Task02 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = getRandomList(10, 15);
        System.out.printf("Первоначальный список:     %s\n", numbers.toString());
        System.out.printf("Список нечетных элементов: %s\n", getOddList(numbers).toString());
    }

    private static ArrayList<Integer> getOddList(ArrayList<Integer> list) {

        Iterator<Integer> iteratorList = list.iterator();

        while (iteratorList.hasNext()) {
            int item = iteratorList.next();
            if (item % 2 == 0) iteratorList.remove();
        }
        return list;
    }

    private static ArrayList<Integer> getRandomList(int size, int upperBond) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(upperBond));
        }
        return list;
    }
}
    
