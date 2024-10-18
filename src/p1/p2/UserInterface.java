package p1.p2;

import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Patient ID:");
        String patientId= scanner.next();

        System.out.print("Enter prescriptionNumber:");
        String prescriptionNumber= scanner.next();

        System.out.print("Enter appointmentDate:");
        String appointmentDate= scanner.next();

        System.out.print("Enter age:");
        int age= scanner.nextInt();

        VisionCure obj=new VisionCure();
        String result=null;
        try
        {
            result=obj.validatePatientDetails(patientId,prescriptionNumber,appointmentDate,age);
        }
        catch (InvalidPatientDetailsException e){
            System.out.println(e.getMessage());
        }

        if(result!=null){
            System.out.println(result);
        }


    }
}
