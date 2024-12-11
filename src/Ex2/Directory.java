package Ex2;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.emptyList;

/*Написать простой класс ТелефонныйСправочник,
который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи.
С помощью метода get() искать номер телефона по фамилии.
Под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводяться все телефоны.
*/
public class Directory {
    private static Map<String, Set<String>> direct; //список контактов

    public Directory(){
        direct = new HashMap<>();
    }

    public void add(String surname, String phone){ // добавить контакт
        Set<String> phones = direct.getOrDefault(surname, new HashSet<>());
        phones.add(phone);
        direct.put(surname, phones);
    }

    public Set<String> get(String surname){ // найти телефоны по фамилии
            if (direct.isEmpty()) { //если справочник пустой
                System.out.println("Справочник пуст, добавьте контакт");
                return null;
            } else if (!direct.containsKey(surname)) { //если фамилии нет
                System.out.println("Контакт с фамилией " + surname + " отсутствует");
                return Collections.emptySet();
            } else { // если фамилия есть
                System.out.println("Номера контакта с фамилией " + surname + ":");
                return direct.get(surname);
            }
    }
}

