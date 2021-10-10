package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Arraylist {

    public static void arraylistWithoutGenerics(){
        ArrayList al=new ArrayList();
        al.add(345);
        al.add("Stringname");
        al.add("balu");
        al.add(45.443);
        al.add('c');
        al.set(1,"india");


        System.out.println(al);
        System.out.println(al.indexOf("balu"));


        System.out.println( al.size());
        System.out.println(al.isEmpty());
        System.out.println(al.indexOf('c'));
        System.out.println(al.lastIndexOf(345));
        Object[] a=al.toArray();
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println(al.size());
    }

    public static void arraylistWithGenerics(){
        ArrayList al=new ArrayList();
        ArrayList<Integer> al1=new ArrayList<Integer>();
        al1.add(234);
        al1.add(345);
        al.add("adi");
        al.add("balu");
        al.add("venky");
        al.add("sunny");
        al.add("suresh");
        al.add(String.valueOf(1234));
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.remove(2));
        System.out.println(al);
        System.out.println(al.size());
        al.add(2,"venky");
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.addAll(al1));
        System.out.println(al1);
        //al.sort();
        System.out.println(al);
    }
    public static void main(String[] args) {
   //arraylistWithoutGenerics();
   arraylistWithGenerics();


    }
}