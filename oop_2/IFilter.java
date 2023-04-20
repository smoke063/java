package oop_2;

import java.util.List;
import java.util.Set;

public interface IFilter {
    List<Product> filter(Integer condition, Object val, Set<Notebook> set);
}
