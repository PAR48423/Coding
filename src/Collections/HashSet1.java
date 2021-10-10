package Collections;

import java.util.HashSet;

public class HashSet1 {
    public static void hashSetwithoutGenerices(){
        HashSet hs=new HashSet();
        hs.add("2341");
        hs.add("2341");
        hs.add(234);
        hs.add(234);
        hs.add(345);
        System.out.println(hs);
        hs.remove(234);
        System.out.println(hs);

        hs.add("blau");
        hs.add("sunny");
        System.out.println(hs);
        System.out.println(hs.contains(345));
        hs.add("sonnu");

    }
    public static void main(String[] args) {
        hashSetwithoutGenerices();
    }
}
