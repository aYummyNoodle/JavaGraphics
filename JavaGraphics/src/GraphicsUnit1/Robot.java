package GraphicsUnit1;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      
      head(window);
      
      //call other methods
      
      upperBody(window);
      lowerBody(window);
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);


		//add more code here
      
      window.setColor(Color.RED);
      window.drawArc(325, 135, 150, 50, -180, 180);
      
      window.setColor(Color.BLACK);
      window.fillOval(385, 140, 25, 25);
      
      window.setColor(Color.GREEN);
      window.fillOval(345, 110, 20, 20);
      window.fillOval(425, 110, 20, 20);
				
   }

   public void upperBody( Graphics window )
   {
	   
		//add more code here
	   
	   window.setColor(Color.BLUE);
	   window.fillRect(320, 220, 160, 100);
	   
	   window.setColor(Color.BLACK);
	   window.drawLine(320, 220, 240, 180);
	   window.drawLine(480, 220, 560, 180);
	   
   }

   public void lowerBody( Graphics window )
   {

		//add more code here
	   
	   window.setColor(Color.GRAY);
	   window.fillRect(320, 350, 160, 100);
	   
	   window.setColor(Color.BLACK);
	   window.drawLine(320, 450, 240, 530);
	   window.drawLine(480, 450, 560, 530);

   }
}