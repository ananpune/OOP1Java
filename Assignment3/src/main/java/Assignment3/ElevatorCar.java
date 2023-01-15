package Assignment3;
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
   }

   public int getFloor ()
   {
      //getter for the floor
      return floor;
   }

   public void gotoFloor (int floorNum) throws Exception
   //going to send the ElevatorCar to the floor, floorNum.
   {
      if (floorNum == 99) {
         //exit case
         System.exit(0);
      }
      boolean val;
      //setting boolean to hold a true/false statement for simplicity
      val = (floorNum > 10 || floorNum < 1 || floorNum > 99);
      if (val) {
         throw new Exception("valid input please");
      }
      if (!val) {
         if (floorNum > floor) {
            //checking if going up + current floor
            System.out.println("Currently at floor: " + floor);
            System.out.println("Going Up");

            while (floorNum - 1 > floor) {

               floor += 1;
               //increment floor
               System.out.println("Floor: " + floor);

            }
            floor += 1;
            System.out.println("Arrived at floor: " + floor);
         }
         else if (floorNum < floor) {
            //checking if going down + current floor
            System.out.println("Currently at floor: " + floor);
            System.out.println("Going Down");

            while (floorNum + 1 < floor) {

               //reduce floor by 1
               floor -= 1;
               System.out.println("Floor: " + floor);

            }
            floor -= 1;
            System.out.println("Arrived at floor: " + floor);

         }
         else if (floorNum == floor) {
            //if already on the floor
            System.out.println("Already on floor " + floor);
         }

      }
   }
}
