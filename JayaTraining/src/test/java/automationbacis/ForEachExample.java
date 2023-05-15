package automationbacis;

public class ForEachExample {


    public static void main(String[] args) {


        int [] a = new int[2];
        a[0]=90;
        a[1]=100;

        //hasNext

        for(int output:a){
            System.out.println(output);
        }

        String [] b ={"abc","iop"};

        for(String k:b){

            System.out.println(k);
        }

    }

}
