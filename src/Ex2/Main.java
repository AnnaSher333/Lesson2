package Ex2;

public class Main {
    public static void main(String[] args) {
        Directory dirct = new Directory();
        dirct.add("Sheremet", "89111333111");
        dirct.add("Ivanov", "89111111111");
        dirct.add("Petrov", "89111111222");
        dirct.add("Sidorov", "89111111333");
        dirct.add("Ivanov", "89111111444");
        dirct.add("Lobanov", "89111111555");
        dirct.add("Pushkin", "89111111666");
        dirct.add("Volkov", "89111111777");
        dirct.add("Ivanov", "89111111888");
        dirct.add("Sheremet", "89111333999");

        System.out.println(dirct.get("Sheremet"));
        System.out.println(dirct.get("Ivanov"));
        System.out.println(dirct.get("Pushkin"));
        System.out.println(dirct.get("Pupkin"));
    }
}
