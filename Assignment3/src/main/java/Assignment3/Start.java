package Assignment3;
import java.util.Scanner;
/**
 * @author Puneet Anand YOU CAN DO THIS!
 */
public class Start
{
   public static void main (String[] args) throws Exception
   {

      ElevatorCar eCar = new ElevatorCar(4);
      //instantiating a ElevatorCar that starts on floor 4
      Scanner scans = new Scanner(System.in);
      //scanner for user input

      while (true) {
         //simplest way I could think of for repeated user inputs

         try {
            //will catch all exceptions from ElevatorCar class
            System.out.println("Currently on floor: " + eCar.floor + " Please Enter Floor Number (99 to exit)");
            eCar.gotoFloor(scans.nextInt());
         }
         catch (Exception e) {
            System.err.println("invalid input, try again");

         }


      }




   }
}
