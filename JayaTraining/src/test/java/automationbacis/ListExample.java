package automationbacis;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List <String> a = new ArrayList<String>();

        a.add("aravinth");
        a.add("jaya");

        System.out.println(a);

        a.add("apple");

        System.out.println(a);

        for(String h:a){
            System.out.println(h);
        }

    }
}
