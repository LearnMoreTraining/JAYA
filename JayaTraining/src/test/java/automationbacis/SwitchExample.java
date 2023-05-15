package automationbacis;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the firstnumber");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        System.out.println("Enter the operation");
        String operator = sc.next();

        switch (operator){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(b-a);
                break;
            case "*":
                System.out.println(b*a);
                break;
            default:
                System.out.println("deafult");

        }

    }
}
