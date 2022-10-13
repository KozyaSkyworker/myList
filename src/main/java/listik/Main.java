package listik;

import java.net.Inet4Address;
import java.text.CollationKey;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyListik<Integer> myListik1 = new MyListik<>();

        myListik1.add(0, 1);
        myListik1.add(1, 22);
        myListik1.add(2, 3);
        myListik1.add(3, 3);
        myListik1.add(4, 5);
        System.out.println("size=" + myListik1.size());
        myListik1.add(122);
        System.out.println("size=" + myListik1.size());
        System.out.println(myListik1.contains(122));

        System.out.println("last index of " + myListik1.lastIndexOf(3));

        System.out.println("get item " + myListik1.get(4));
        myListik1.set(4, 99);
        System.out.println("get item " + myListik1.get(4));

        System.out.println("\n\n");

        for (int i = 0; i < myListik1.size(); i++){
            System.out.println(i + " -- " + myListik1.get(i));
        }

        myListik1.add(123);
        myListik1.add(124);
        myListik1.add(224);
        myListik1.add(225);

        System.out.println("\n");

        myListik1.remove(3);

        for (int i = 0; i < myListik1.size(); i++){
            System.out.println(i + " -- " + myListik1.get(i));
        }

        // удаление по элементу
        myListik1.remove((Object)22);

        MyListik<Integer> mySubListik = new MyListik();
        mySubListik =  myListik1.subList(2, 6);
        for (int i = 0; i < mySubListik.size(); i++){
            System.out.println(i + " -sub- " + mySubListik.get(i));
        }

        System.out.println("\n");

        System.out.println(myListik1.toArray());

        myListik1.clear();

        System.out.println("size = " + myListik1.size());
    }
}
