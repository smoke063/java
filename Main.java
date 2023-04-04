import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<Notebook>();

        set.add(new Notebook("Computer 1", Color.BLUE, 250, 16));
        set.add(new Notebook("Computer 2", Color.RED, 2350, 32));
        set.add(new Notebook("Computer 3", Color.GREEN, 22450, 64));
        set.add(new Notebook("Computer 4", Color.BLUE, 50, 8));
        set.add(new Notebook("Computer 5", Color.RED, 550, 100));
        set.add(new Notebook("Computer 6", Color.GREEN, 550, 256));

        var conditions = doFilter();
        List<Notebook> res = new ArrayList<>();
        conditions.forEach((integer, o) -> {
            filter(integer, o, set).forEach(notebook -> {
                res.add(notebook);
            });
        });
        res.forEach(notebook -> {
            System.out.println("Ноутбук:");
            System.out.println(notebook.name);
            System.out.println(notebook.color);
            System.out.println(notebook.price);
            System.out.println(notebook.memory);
        });
    }

    public static HashMap<Integer, Object> doFilter() {
        HashMap<Integer, Object> map = new HashMap<>();
        int num = 0;
        while (num != -1) {
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            System.out.println("1 - Имя содержит след строку");
            System.out.println("2 - Цвет");
            System.out.println("3 - Цена больше чем. Введите цифру:");
            System.out.println("4 - Память больше чем. Введите цифру:");
            System.out.println("-1 - Для выхода Введите цифру: -1");
            Scanner s = new Scanner(System.in);
            num = s.nextInt();

            if (num != -1) {
                System.out.println("Введите значение:");
                map.put(num, s.next());
            }
        }
        return map;
    }

    public static List<Notebook> filter(Integer condition, Object val, Set<Notebook> set) {
        switch (condition) {
            case 1:
                return set.stream().filter(x -> x.name.contains((String) val)).collect(Collectors.toList());
            case 2:
                return set.stream().filter(x -> x.color == val).collect(Collectors.toList());
            case 3:
                return set.stream().filter(x -> x.price > ((Integer) val)).collect(Collectors.toList());
            case 4:
                return set.stream().filter(x -> x.memory > ((Integer) val)).collect(Collectors.toList());
        }
        return set.stream().collect(Collectors.toList());
    }
}