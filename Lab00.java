/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Riley Evans>  // replace <...> with your name
* @version <10/22/2014> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab00 {

     public static void main(String[] args) {
             Display.openWorld("maps/first.map");
   Display.setSize(10, 10);
   Display.setSpeed(3);
   Robot karel = new Robot();
   karel.move();
     karel.pickBeeper();
   karel.move();
   karel.turnLeft();
   karel.move();
   karel.putBeeper();
   karel.move();
   karel.turnLeft();
   
   
     }
}
