package Collections;

import java.util.Comparator;
import java.util.LinkedList;

public class Linkedlist1 {
    public static void linkeslistwithoutGenerice(){
        //Linkedlist ll=new Linkedlist();
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("balu");
        ll.add("sunny");
        ll.add("venky");
        ll.add("sss");
        ll.add("sunnu");
        for (Object ss:ll)
            System.out.println(ss);
        //ll.sort();
        System.out.println(ll);

    }


    public static void main(String[] args) {
linkeslistwithoutGenerice();
    }
}
