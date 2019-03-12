/*
 * 1. Создать список случайных чисел. Используя Stream Api подсчитать среднее арифиметическое квадратов этих чисел.
 */

package gz.hw13.t1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        // Filling integerArrayList with random numbers from 0 to 99 (type int)
        for (int i = 0; i < 20; i++) {
            integerArrayList.add((int) (Math.random() * 100));
        }

        System.out.println("Randomized array:");
        System.out.println(integerArrayList);

        System.out.print("Sorted array:\n[");
        integerArrayList.stream().sorted().forEach((element)->System.out.printf(" %d ", element));
        System.out.println("]");

    }

}
