package com.mycompany.assignment3;


/**
 * @author Puneet Anand YOU CAN DO THIS!
 */
public class ElevatorCar
{
   public int floor;
   // instance variable which olds the floor the 
   //ElevatorCar is on.

   public ElevatorCar (int floorNum)
   {
      //ElevatorCar constructor
      floor = floorNum;
      this.floor = floor;
   }

   public int getFloor ()
   {
      //getter for the floor
      return this.floor;
   }

   public void gotoFloor (int floorVal) throws Exception
   {
      if (floorVal < 1) {
         throw new Exception("Please enter a value greater than 1. ");

      }
      else if (floorVal > 10 && floorVal != 99) {
         throw new Exception("Please enter a value less than 10 or 99 to exit.");
      }
      if (floorVal > this.floor) {
         System.out.println("Currently at floor " + this.floor);
         System.out.println("Going Up");

         while (floorVal != this.floor - 1) {
            this.floor += 1;
            System.out.println("Floor: " + this.floor);
         }
         System.out.println("Arrived at floor: " + floorVal);
      }
      if (floorVal < this.floor) {
         System.out.println("Currently at floor " + this.floor);
         System.out.println("Going Down");

         while (floorVal + 1 != this.floor) {
            this.floor -= 1;
            System.out.println("Floor: " + this.floor);
         }
         System.out.println("Arrived at floor: " + floorVal);
      }
      if (floorVal == this.floor) {
         System.out.println("You are still on this Floor! Enter a floor number!");
      }
   }
}
