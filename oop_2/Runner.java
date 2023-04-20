package oop_2;

import java.util.HashSet;
import java.util.Set;

public class Runner {

    public void run() {
        IFilter f = new Filter();

        Set<Notebook> set = new HashSet<Notebook>();

        set.add(new Notebook("Computer 1", 250, 16));
        set.add(new Notebook("Computer 2", 2350, 32));
        set.add(new Notebook("Computer 3", 22450, 64));
        set.add(new Notebook("Computer 4", 50, 8));
        set.add(new Notebook("Computer 5", 550, 100));
        set.add(new Notebook("Computer 6", 550, 256));

        var res = f.filter(2, 400, set);
        for (var i : res) {
            i.display();
        }
    }
}
