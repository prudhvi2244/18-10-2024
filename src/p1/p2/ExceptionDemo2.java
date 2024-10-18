package p1.p2;

import java.util.Scanner;

public class ExceptionDemo2 {


    private static void f1(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        if(a<18){
            throw new InvalidAgeException("Age is not valid!");
        }

    }

    public static void main(String[] args) {
        ExceptionDemo2.f1();
    }
}
