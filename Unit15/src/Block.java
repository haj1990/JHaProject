//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setX(100);
		setY(100);
		setWidth(10);
		setHeight(10);
		setColor(Color.black);
	}
	
	public Block(int x, int y) {
		setX(x);
		setY(y);
		setWidth(10);
		setHeight(10);
		setColor(Color.black);
	}

	public Block(int x, int y, int wide, int tall) {
		setX(x);
		setY(y);
		setWidth(wide);
		setHeight(tall);
		setColor(Color.black);
	}
	
	public Block(int x, int y, int wide, int tall, Color col) {
		setX(x);
		setY(y);
		setWidth(wide);
		setHeight(tall);
		setColor(col);
	}
	
	public void setPos(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public void setX(int x) {
		xPos = x;
	}
   
	public void setY(int y) {
		yPos = y;
	}
	
	public void setWidth(int wide) {
		width = wide;
	}
	
	public void setHeight(int tall) {
		height = tall;
	}

   public void setColor(Color col)
   {
	   color = col;
   }

   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		if (((Block)obj).getX() == getX() && ((Block)obj).getY() == getY() && ((Block)obj).getWidth() == getWidth() && ((Block)obj).getHeight() == getHeight()) {
			return true;
		}
		return false;
	}   

	public int getX() {
		return xPos;
	}
	
	public int getY() {
		return yPos;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public Color getColor() {
		return color;
	}
	
	public String toString() {
		String output = "";
		output += getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + color;
		return output;
	}
    
}