package com.mycompany.assignment3;
import java.util.Scanner;

/**
 * @author Puneet Anand YOU CAN DO THIS!
 */
public class Start
{
   public static void main (String[] args) throws Exception
   {
      ElevatorCar eCar = new ElevatorCar(4);
      Scanner scans = new Scanner(System.in);
      int currentFloor = eCar.getFloor();
      System.out.println("Currently on floor: " + currentFloor + " Please Enter a Floor Number Now (99 to exit)");
      int userFloor = scans.nextInt();
      if (userFloor == 99) {

      }
      while (userFloor != currentFloor) {
         eCar.gotoFloor(userFloor);
      }




      {

      }
   }

}
