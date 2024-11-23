package Ex3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        List<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 1000000; i++){
            al.add((int)Math.random()*100);
            ll.add((int)Math.random()*100);
        }

        TimeForOperations tfo = new TimeForOperations();
        System.out.printf("%-20s %-10s %-10s\n", "Сравнение","ArrayList","LinkedList");
        System.out.println("-------------------------------------");
        tfo.addTime(al, ll, 1);
        System.out.printf("%-23s %-10s %-10s\n", "Вставка в начало",tfo.getArl(),tfo.getLil());
        tfo.addTime(al, ll, 500000);
        System.out.printf("%-23s %-10s %-10s\n", "Вставка в середину",tfo.getArl(),tfo.getLil());
        tfo.addTime(al, ll, 999999);
        System.out.printf("%-23s %-10s %-10s\n", "Вставка в конец",tfo.getArl(),tfo.getLil());
        System.out.println("-------------------------------------");
        tfo.getTime(al, ll, 1);
        System.out.printf("%-23s %-10s %-10s\n", "Получить из начала",tfo.getArl(),tfo.getLil());
        tfo.getTime(al, ll, 500000);
        System.out.printf("%-23s %-10s %-10s\n", "Получить из середины",tfo.getArl(),tfo.getLil());
        tfo.getTime(al, ll, 999999);
        System.out.printf("%-23s %-10s %-10s\n", "Получить из конеца",tfo.getArl(),tfo.getLil());
        System.out.println("-------------------------------------");
        tfo.removeTime(al, ll, 1);
        System.out.printf("%-23s %-10s %-10s\n", "Удалить из начала",tfo.getArl(),tfo.getLil());
        tfo.removeTime(al, ll, 500000);
        System.out.printf("%-23s %-10s %-10s\n", "Удалить из середины",tfo.getArl(),tfo.getLil());
        tfo.removeTime(al, ll, 999999);
        System.out.printf("%-23s %-10s %-10s\n", "Удалить из конеца",tfo.getArl(),tfo.getLil());
        System.out.println("-------------------------------------");
    }
}
