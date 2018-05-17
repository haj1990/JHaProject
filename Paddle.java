//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10);
      speed =5;
   }

   public Paddle(int x, int y) {
		super(x,y);
		speed =5;
	}
   
   public Paddle(int x, int y, int s) {
		super(x,y);
		setSpeed(s);
	}
	
	public Paddle(int x, int y, int wide, int tall, int s) {
		super(x,y,wide,tall);
		setSpeed(s);
	}
	
	public Paddle(int x, int y, int wide, int tall, Color col, int s) {
		super(x,y,wide,tall, col);
		setSpeed(s);
	}

   public void setSpeed(int s) {
	   speed = s;
   }

   public void moveUpAndDraw(Graphics window)
   {
	   super.draw(window, Color.WHITE);
	   super.setY(getY()-speed);
	   super.draw(window);

   }

   public void moveDownAndDraw(Graphics window)
   {
	   super.draw(window, Color.WHITE);
	   super.setY(getY()+speed);
	   super.draw(window);

   }
   
   public void moveLeftAndDraw(Graphics window)
   {
	   super.draw(window, Color.WHITE);
	   super.setX(getX()-speed);
	   super.draw(window);
   }
   
   public void moveRightAndDraw(Graphics window)
   {
	   super.draw(window, Color.WHITE);
	   super.setX(getX()+speed);
	   super.draw(window);

   }

   public int getSpeed() {
	   return speed;
   }
   
   public String toString() {
	   String output = " ";
	   output += super.toString() + " " + speed;
	   return output;
   }
}