package Collections;

import java.util.*;

public class MyArrayList {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();

        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(50);

        // list.remove(3);

        // System.out.println("ArrayList: " + list.get(1));

        // LinkedList<Integer> list = new LinkedList<>();

        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(50);

        // System.out.println("LinkedList: " + list);
        // System.out.println("Value at index 1: " + list.get(1));

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(10);
        set.add(20);

        set.remove(30);

        System.out.println("HashSet: " + set);
    }
}
