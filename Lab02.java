/**
*
* Description of the program goes here  // provide a brief description
*
* @author Jack Navin-Weinstein  // replace <...> with your name
* @version 30/10/14 // replace <...> with the date
*/

import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

 public class Lab02 {
 
    public static void main(String[] args) {
    
    Display.openWorld("maps/maze.map");
    Display.setSize(8, 8);
    Athlete Jacky = new Athlete();
            Jacky.putBeeper();
            Jacky.move();
            Jacky.putBeeper();
            Jacky.turnRight();
            Jacky.move();
            Jacky.putBeeper();
            Jacky.turnRight();
            Jacky.move();
            Jacky.putBeeper();
            Jacky.turnLeft();
            Jacky.move();
            Jacky.putBeeper();
            Jacky.turnLeft();
            Jacky.move();
            Jacky.putBeeper();
            Jacky.turnRight();
            Jacky.move();
            Jacky.putBeeper();
            Jacky.move();
            Jacky.putBeeper();
            Jacky.turnRight();
            Jacky.move();
            Jacky.putBeeper();
            Jacky.turnLeft();
            Jacky.move();
            Jacky.putBeeper();
            Jacky.turnLeft();
            Jacky.move();
            Jacky.putBeeper();
            Jacky.move();
            Jacky.putBeeper();
            Jacky.move();
            Jacky.putBeeper();
            Jacky.move();
            Jacky.putBeeper();
            Jacky.turnRight();
            Jacky.move();
            Jacky.putBeeper();
            Jacky.move();
            
            
    
    }
 }