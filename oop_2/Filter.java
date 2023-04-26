package oop_2;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Filter implements IFilter {
    @Override
    public List<Product> filter(Integer condition, Object val, Set<Notebook> set) {
        switch (condition) {
            case 1:
                return set.stream().filter(x -> x.getName().contains((String) val)).collect(Collectors.toList());
            case 2:
                return set.stream().filter(x -> x.getPrice() > ((Integer) val)).collect(Collectors.toList());
            case 3:
                return set.stream().filter(x -> x.getMemory() > ((Integer) val)).collect(Collectors.toList());
        }
        return set.stream().collect(Collectors.toList());
    }
}
