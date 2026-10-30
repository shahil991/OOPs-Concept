package CollectionFramework.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> al = new LinkedList<Integer>();
        al.add(11);
        al.add(12);
        al.add(13);
        al.add(14);

//        System.out.println(al);
        Iterator<Integer> iterator = al.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
