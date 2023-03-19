import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Hw_4_1 {

    Deque<Integer> deque;

    public Hw_4_1() {
        deque = new LinkedList();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
    }

    public void printRevertCollection() {
        for (Iterator itr = deque.descendingIterator();
             itr.hasNext(); ) {
            System.out.print(itr.next() + "->");
        }
    }
}
