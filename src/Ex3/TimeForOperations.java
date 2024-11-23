package Ex3;

import java.util.List;
//Дополнительное ДЗ:ArrayList VS LinkedList
//сравнить скорость проведения операций вставки, получния и удаления
//коллекций ArrayList и LinkedList
public class TimeForOperations {
private long arl;
private long lil;
    //выводим время на операцию добавления элемента по индексу
    public void addTime(List<Integer> al, List<Integer> ll, int index) {
        long startal = System.currentTimeMillis();
        al.add(index, 3);
        long stopal = System.currentTimeMillis();
        this.arl = stopal - startal;

        long startll = System.currentTimeMillis();
        ll.add(index, 3);
        long stopll = System.currentTimeMillis();
        this.lil = stopll-startll;
    }
    //выводим время на операцию получения элемента по индексу
    public void getTime(List<Integer> al, List<Integer> ll, int index) {
        long startal = System.currentTimeMillis();
        al.get(index);
        long stopal = System.currentTimeMillis();
        this.arl = stopal - startal;

        long startll = System.currentTimeMillis();
        ll.get(index);
        long stopll = System.currentTimeMillis();
        this.lil = stopll-startll;
    }
    //выводим время на операцию удаления элемента по индексу
    public void removeTime(List<Integer> al, List<Integer> ll, int index) {
        long startal = System.currentTimeMillis();
        al.remove(index);
        long stopal = System.currentTimeMillis();
        this.arl = stopal - startal;

        long startll = System.currentTimeMillis();
        ll.remove(index);
        long stopll = System.currentTimeMillis();
        this.lil = stopll-startll;
    }

    public long getArl() {
        return arl;
    }

    public long getLil() {
        return lil;
    }
}
