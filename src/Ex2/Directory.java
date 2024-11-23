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
    private String surname; //фамилия
    private String phone; //телефон
    private static List<Directory> direct = new ArrayList<>(); //список контактов

    public Directory(){
    }
    public Directory(String surname, String phone){
        this.surname = surname;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void add(String surname, String phone){ // добавить контакт
        direct.add(new Directory(surname, phone));
    }

    public List<String> get(String surname){ // найти телефон по фамилии
        List<String> list = new ArrayList<>();
            if (direct.isEmpty()) { //на случай, если справочник пустой
                System.out.println("Справочник пуст, добавьте контакт");
            } else if (uniqSurname().contains(surname)) { //если фамилия есть
                List<String> list2 = new ArrayList<>();
                System.out.println("Телефоны контакта " + surname + ":");
                direct.stream().filter(s -> s.surname.equals(surname))
                        .forEach(s -> list2.add(s.getPhone()));
                list = list2;
            } else { // если фамилии нет
                System.out.println("Контакт с фамилией " + surname + " отсутствует");
                list = Collections.emptyList();
            }
            return list;
    }

    //Вспомогательный метод проверка: список уникальных фамилий
    public Set<String> uniqSurname(){
        Set<String> set = new HashSet<>();
        direct.stream().forEach(d -> set.add(d.surname));
        return set;
    }
}

