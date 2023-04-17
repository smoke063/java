import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Hw_6 {
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
