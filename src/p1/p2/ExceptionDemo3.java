package p1.p2;

import java.util.Scanner;

public class ExceptionDemo3 {

    private  static void f1() throws InvalidGenderException{

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your gender( MALE | FEMALE )");
        String gender=sc.next();
        if(gender.equals("MALE") || gender.equals("FEMALE")){
            System.out.println("You are gender :"+gender);
        }
        else{
            throw new InvalidGenderException("Given Gender is Not valid");
        }

    }

    public static void main(String[] args) {

        try
        {
            ExceptionDemo3.f1();
        }
        catch (InvalidGenderException e){
           e.printStackTrace();
        }


    }

}
