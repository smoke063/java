import java.util.ArrayList;
import java.util.Comparator;

public class Hw_3_1 {

    private ArrayList<Good> getGoodList() {
        ArrayList<Good> goods = new ArrayList<Good>();
        goods.add(new Good("Высший 1", 1143, 2));
        goods.add(new Good("Good 2", 1235, 2));
        goods.add(new Good("Высший 3", 234, 1));
        goods.add(new Good("Good 4", 123, 2));
        goods.add(new Good("Высший 5", 52, 2));
        goods.add(new Good("Good 6", 242, 1));
        goods.add(new Good("Высший 6", 222, 1));
        goods.add(new Good("Высший 6", 1142, 2));
        return goods;
    }
    public void findHighestPrice() {
        ArrayList<Good> goods = this.getGoodList();
        int highestPrice = goods.stream().filter(x -> x.name.contains("Высший") && (x.sort == 1 || x.sort == 2))
                                .max(Comparator.comparing(Good::getPrice)).get().getPrice();
        System.out.println(highestPrice);
    }
}
