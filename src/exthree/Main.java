package exthree;


public class Main {
    public static void main(String[] args) {
        SortedObjects<Integer> sortedObjects = new SortedObjects<>();
        sortedObjects.add(5);
        sortedObjects.add(2);
        sortedObjects.add(8);
        sortedObjects.add(1);
        sortedObjects.add(10);
        sortedObjects.display();
        System.out.println("with List");
        SortedObjectsUsingList<Integer> sortedList = new SortedObjectsUsingList<>();
        sortedList.add(5);
        sortedList.add(2);
        sortedList.add(8);
        sortedList.add(1);
        sortedList.add(10);
        sortedList.display();
        System.out.println("with set");
        SortedObjectsUsingSet<Integer> sortedSet = new SortedObjectsUsingSet<>();
        sortedSet.add(5);
        sortedSet.add(2);
        sortedSet.add(8);
        sortedSet.add(1);
        sortedSet.add(10);

        sortedSet.display();
    }

}


