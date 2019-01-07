package Lesson3HW;

/*
Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи.
С помощью метода get() искать номер телефона по фамилии.
Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны.
 */

import java.util.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class Phonebook {


    //Создаем коллекцию
    Map<String, HashSet<String>> pb;

    public Phonebook(){
        pb = new HashMap<>();
    }

    //Метод для добавления имени и телефона
    public void add(String name, String number) {
        HashSet<String> phones = pb.getOrDefault(name, new HashSet<>());
        phones.add(number);
        pb.put(name, phones);
    }

    //Метод для получения номера по имени
    public void get(String name) {
        System.out.println( "телефон:" + pb.get(name));
    }

}
