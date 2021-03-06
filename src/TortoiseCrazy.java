import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;
/* Teacher�s note: before beginning, draw a pentagon and have students work out the angle that the tortoise will have to turn (360/5) */

public class TortoiseCrazy
{
 public static void main(String[] args)
 {
   new TortoiseCrazy().makePrettyThings();
 }

 private void makePrettyThings()
 {
	 Tortoise.setPenColor(PenColors.getRandomColor());
     // 6. make the tortoise go at maximum speed
Tortoise.setSpeed(10);

     // 9. choose a color that you like for the shape
Tortoise.setPenColor(PenColors.Reds.Crimson);
 
     // 2. make a variable for the number of sides you want (can�t test this one)
int sides = 5;
     // 3. make a variable for the angle you want the tortoise to turn. Hint: you can divide in Java using �/�.  Can�t test until step 5.
int angle = 360/sides;
int width = 0;
     // 5. Do everything below 200 times. When this is done you will see a pentagon.
   for (int i= 0;i<200;i++)
   {
         // 1. move the tortoise 100 pixels
    Tortoise.move(i);
         // 7. make the tortoise move "i" pixels instead of 100 (don�t need new line of code for this, just change previous one)
         // 4. turn the tortoise the amount in your angle variable
      Tortoise.turn(angle);   
      Tortoise.setPenColor(PenColors.getRandomColor());
         // 8. turn the tortoise one more degree
      Tortoise.turn(1); 
      width = i/60 + 1;
      System.out.println(width);
      Tortoise.setPenWidth(width);
    }
 }

 //Variations:
 //  *9. make the pattern really huge
 //  *10. change the color of the pattern
 //  *11. experiment with different shapes
 //  *12. create a method called, "adjustPen()"
 //        that makes the pen get increasingly bigger.
 //          stop the pen getting too big (width of 4 or more is too big)
 //  *13. choose 5 colors and change them every time adjustPen() is called
}
// Copyright Wintriss Technical Schools 2013