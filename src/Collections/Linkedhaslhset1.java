package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkedhaslhset1 {
    public static void linkedHashSet(){
    LinkedHashSet lhs=new LinkedHashSet();
        lhs.add("2341");
        lhs.add("2341");
        lhs.add(234);
        lhs.add(234);
        lhs.add(345);
        System.out.println(lhs);
        lhs.remove(234);
        System.out.println(lhs);

        lhs.add("blau");
        lhs.add("sunny");
        System.out.println(lhs);
        System.out.println(lhs.contains(345));
        lhs.add("sonnu");

}
    public static void main(String[] args) {

linkedHashSet();
    }
}
