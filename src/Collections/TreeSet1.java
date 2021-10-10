package Collections;


import java.util.TreeSet;

public class TreeSet1 {
    public static void  treesetWithOutGenerics(){
        TreeSet ts=new TreeSet();
        ts.add(2341);
       ts.add(4567);
       ts.add(5672);
        System.out.println(ts);
        ts.add(2211);
        ts.add(34);
        System.out.println(ts);
           ts.remove(5672);
           ts.add(34);
        System.out.println(ts);
    }
    public static void main(String[] args) {
        treesetWithOutGenerics();
    }
}
