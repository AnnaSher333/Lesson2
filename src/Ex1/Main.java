package Ex1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        String[] arr = {"Yellow", "Red", "Black", "Green", "Blue",
                        "Yellow", "Orange", "Gray", "Red", "Gold",
                        "Pink", "Gray", "White", "Brown", "Black",
                        "Red", "Orange", "Gray", "Red", "Gold"};
        //Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        System.out.println("Уникальные слова:");
        System.out.println(new HashSet<>(List.of(arr)));
        System.out.println("------------------------------");

        //Посчитать сколько раз встречается каждое слово.
        System.out.println("Дубли слов:");
        Map<String, Integer> hm = new HashMap<>();
        Arrays.stream(arr).forEach(s -> hm.put(s, Collections.frequency(List.of(arr), s)));
        System.out.println(hm);
        System.out.println("------------------------------");
    }
}