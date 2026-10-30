package CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        Iterator<Integer> i = al.iterator();
        while(i.hasNext()) {
            Integer next = i.next();

            System.out.println(next);
        }

//        for(int i=0; i<al.size(); i++) {
//            if(i==2) {
//                al.remove(i);
//            }
//            System.out.println(al.get(i));
//        }

        //Iterator
//        for(Integer elm : al) {
//            if(elm==30) {
//                al.remove(elm);
//            }
//            System.out.println(elm);
//        }
    }
}
