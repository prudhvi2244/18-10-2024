package p1.p2;

import java.util.Scanner;

public class VisionCure {

   String validatePatientDetails(String patientId,String  prescriptionNumber ,String appointmentDate,int age ) throws InvalidPatientDetailsException
   {
       String msg="Patient Details Validated Successfully for patientId:"+patientId;
       String pid1=patientId.substring(0,3).toUpperCase();
       if(!pid1.contains(patientId.substring(0,3)) || !patientId.substring(3,8).contains("0-9")){
           throw new InvalidPatientDetailsException("Invalid Patient ID");
       }

        return msg;
    }

}
