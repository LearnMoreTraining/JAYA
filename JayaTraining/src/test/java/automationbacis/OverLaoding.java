package automationbacis;

public class OverLaoding {

    static int a = 20;
    public static void main(String[] args) {

        OverLaoding o = new OverLaoding();
        System.out.println(a);
       o.sample();

    }

    private void sample(){
        final int a= 5;

        System.out.println(a);
        System.out.println(this.a*2);


    }

    private void m1(int a , int b){

        System.out.println(a+b);

    }

    private void m1(int a){

        System.out.println(a*2);
    }

    private void m1(String a){

        System.out.println(a);
    }

    private void m1(int a , int b , int c){

        System.out.println(a+b+c);
    }
}
