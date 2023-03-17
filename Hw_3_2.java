import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Hw_3_2 {

    private ArrayList<Good> getGoodList() {
        ArrayList<Good> goods = new ArrayList<Good>();
        goods.add(new Good("Высший 1", 1143, 2, "sss", 345));
        goods.add(new Good("Good 2", 1235, 2, "sss", 345));
        goods.add(new Good("Высший 3", 234, 1, "sss", 345));
        goods.add(new Good("Good 4", 123, 2, "sss", 345));
        goods.add(new Good("Высший 5", 52, 2, "sss", 345));
        goods.add(new Good("Good 6", 242, 1, "sss", 345));
        goods.add(new Good("Высший 6", 222, 1, "sss", 345));
        goods.add(new Good("Высший 6", 1142, 2, "sss", 345));
        return goods;
    }

    public ArrayList<String> getNameOfMinGoodsBySort(int sort) {
        ArrayList<Good> goods = this.getGoodList();
        Map<Integer, List<Good>> groups = goods.stream().filter(x -> x.sort == sort).collect(Collectors.groupingBy(Good::getSort));
        return groups.values().stream().min(Comparator.comparing(Good::getPrice)).get().stream().map(x -> x.getName());
    }
}
