package CollectionFramework.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        int i = al.indexOf(2);
        System.out.println(al.indexOf(i));

    }
}
