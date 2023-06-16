package exthree;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedObjectsUsingList<E extends Comparable<E>> {
    private List<E> elements;

    public SortedObjectsUsingList() {
        elements = new ArrayList<>();
    }

    public void add(E element) {
        elements.add(element);
        Collections.sort(elements);
    }

    public void display() {
        for (E element : elements) {
            System.out.println(element);
        }
    }
}
