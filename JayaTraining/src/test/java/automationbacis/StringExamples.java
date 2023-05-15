package automationbacis;

public class StringExamples {

    public static void main(String[] args) {

        String a = "Madurai" ;
        String b = "madurai";

        System.out.println(a.length());
        System.out.println(a.concat(b));
        System.out.println(b.concat(a));
        System.out.println(a.trim());
        System.out.println(b.charAt(1));
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        String v = "Aravinth";
        System.out.println(v.substring(1,5));

        String bb = "123a";
        String cc = bb.replace('a','6');
       int h= Integer.parseInt(cc);
        System.out.println(h+1);











    }
}
