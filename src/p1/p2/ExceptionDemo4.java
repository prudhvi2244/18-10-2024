package p1.p2;

import java.util.Scanner;

public class ExceptionDemo4 {

    void f1() {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter email id:");
        String email=scanner.next();

        if(!email.endsWith("@capgemini.com")){
            try{
                throw new InvalidCompanyEmailException("This is not capgemini email");
            }
            catch (InvalidCompanyEmailException e){
                e.printStackTrace();
            }

        }

    }

    public static void main(String[] args) {

        ExceptionDemo4 demo=new ExceptionDemo4();
        demo.f1();


    }
}
