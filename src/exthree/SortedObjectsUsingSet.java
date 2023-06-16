package exthree;
import java.util.Set;
import java.util.TreeSet;
public class SortedObjectsUsingSet<E extends Comparable<E>> {
    private Set<E> elements;

    public SortedObjectsUsingSet() {
        elements = new TreeSet<>();
    }

    public void add(E element) {
        elements.add(element);
    }

    public void display() {
        for (E element : elements) {
            System.out.println(element);
        }
    }

}
