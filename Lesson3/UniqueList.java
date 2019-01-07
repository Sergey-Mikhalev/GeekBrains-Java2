package Lesson3HW;

/*
Создать массив с набором слов (10-20 слов, среди которых должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.
*/

import java.util.*;
import java.util.HashMap;
import java.util.HashSet;

public class UniqueList {
        public static void main(String[] args) {


            String[] elements = {"Helium", "Hydrogen", "Oxygen", "Silicon", "Hydrogen", "Oxygen", "Gold", "Helium", "Oxygen", "Silicon", "Silver"};

            // Создаем коллекцию для слов
            Map<String, Integer> map = new HashMap<>();
            // Считаем сколько раз встречается заданное слово
            for (String element : elements) {
                map.merge(element, 1, (a, b) -> a + b);
            }
            System.out.println(map);
            System.out.println("");

            // Выводим только уникальные слова
            Set<String> uniqElements = new HashSet<>(Arrays.asList(elements));
            System.out.println(uniqElements);
            System.out.println("");


    }
}
