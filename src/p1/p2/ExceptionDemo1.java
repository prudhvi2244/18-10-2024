package p1.p2;

import java.util.Scanner;

public class ExceptionDemo1 {

    private static void f1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("E8nter a number");
        String s=sc.next();
        try {
            int i=Integer.parseInt(s);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        finally {
            sc.close();
            System.out.println("Finally block executed");
        }


    }

    public static void main(String[] args) {
            ExceptionDemo1.f1();


    }
}
