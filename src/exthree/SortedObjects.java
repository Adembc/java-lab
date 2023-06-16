package exthree;

import java.util.ArrayList;
import java.util.List;

public class SortedObjects<E extends Comparable<E>> {
    private List<E> elements;

    public SortedObjects() {
        elements = new ArrayList<>();
    }

    public void add(E element) {
        int index = 0;
        while (index < elements.size() && element.compareTo(elements.get(index)) >= 0) {
            index++;
        }
        elements.add(index, element);
    }

    public void display() {
        for (E element : elements) {
            System.out.println(element);
        }
    }
}
