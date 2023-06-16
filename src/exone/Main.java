package exone;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // A)
        List<String> l = new LinkedList<String>();
        l.add("adem");
        l.add("bc");
        l.add("2002");
        Collections.swap(l, 0, l.size() - 1);
        Iterator<String> it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // B)
        int[] array = {1, 2, 3, 4, 5};
        List<Integer> list = new ArrayList<>();
        //second way is to loop with iterator
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        System.out.println("Copied List: " + list);
        //C)
        Collections.shuffle(list);
        System.out.println("List after randomly permutation: " + list);
        //D)

        //E) no because set does not persist position
    }
}
