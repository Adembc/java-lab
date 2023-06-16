package extwo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<Integer>();
        for (int i = 1 ; i<= 10; i++){
            tab.add(i);
        }
        System.out.println("Even numbers in natural order:");
        for (Integer num : tab) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println("Even numbers in reverse order:");
        ListIterator<Integer> it = tab.listIterator(tab.size());
        while (it.hasPrevious()){
         Integer  num = it.previous();
           if (num % 2 == 0)
            System.out.println(num);
        }
        System.out.println("Even numbers in reverse order 2:");
        for(int i = tab.size() -1 ; i>= 0 ; i--){
            if (tab.get(i) % 2 == 0)
             System.out.println(tab.get(i));
        }
    }
}
