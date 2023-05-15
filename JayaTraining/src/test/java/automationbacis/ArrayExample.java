package automationbacis;

public class ArrayExample {

    public static void main(String[] args) {

        int [] a = {23,89,77,66} ;

        //index order - 0,1,2,3
        // length - 4
        System.out.println(a[2]);

        String [] name = {"aravinth","jaya"};
        System.out.println(name[1]);

        for(int i =0 ;i<a.length;i++){

            System.out.println(a[i]);

        }

        for(int j=0;j<name.length;j++){
            System.out.println(name[j]);
        }

    }

}
