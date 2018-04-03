//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y) {
		super(x,y);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int wide, int tall) {
		super(x,y,wide,tall);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int wide, int tall, Color col) {
		super(x,y,wide,tall, col);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int wide, int tall, int xs, int ys) {
		super(x,y,wide,tall);
		setXSpeed(xs);
		setYSpeed(ys);
	}
	
	public Ball(int x, int y, int wide, int tall, Color col, int xs, int ys) {
		super(x,y,wide,tall,col);
		setXSpeed(xs);
		setYSpeed(ys);
	}
	   
   public void setXSpeed(int x) {
	   xSpeed = x;
   }
   
   public void setYSpeed(int y) {
	   ySpeed = y;
   }
   

   public void moveAndDraw(Graphics window)
   {

	  draw(window, Color.white);
      setX(getX()+xSpeed);
      setY(getY()+ySpeed);
		draw(window);
   }
   
	public boolean equals(Object obj)
	{
		if (((Block)obj).getX() == getX() && ((Block)obj).getY() == getY() && ((Block)obj).getWidth() == getWidth() && ((Block)obj).getHeight() == getHeight() && ((Ball)obj).getXSpeed() == getXSpeed() && ((Ball)obj).getYSpeed() == getYSpeed()) {
			return true;
		}
		return false;
	}   

   public int getXSpeed() {
	   return xSpeed;
   }
   
   public int getYSpeed() {
	   return ySpeed;
   }

	public String toString() {
		String output = "";
		output += getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + getXSpeed() + " " + getYSpeed();
		return output;
	}
	
	public boolean didCollideLeft(Object obj){
		Block object = (Block) obj;
		if (getX() > object.getX() && getX() <= object.getX() + object.getWidth() && (getY() >= object.getY() && getY() + getHeight() <= object.getY() + object.getHeight())){
			return true;
		}
		return false;
	}
	
	public boolean didCollideRight(Object obj){
		Block object = (Block)obj;
		if (getX() < object.getX() && getX() + getWidth() >= object.getX() && (getY() >= object.getY() && getY() + getHeight() <= object.getY()+object.getHeight())){
			return true;
		}
		return false;
	}
	public boolean didCollideTop(Object obj){
		Block object = (Block)obj;
		if (getY()+getHeight() >= object.getY() && getY() < object.getY()+object.getHeight() && (getX()>=object.getX() && getX()+getWidth()<=object.getX()+object.getWidth())){
			return true;
		}
		return false;
	}
	public boolean didCollideBottom(Object obj){
		Block object = (Block)obj;
		if (getY() <= object.getY()+object.getHeight() && getY()+getHeight() > object.getY() && (getX()>=object.getX() && getX()+getWidth()<=object.getX()+object.getWidth())){
			return true;
		}
		return false;
	}
	
}