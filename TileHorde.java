//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class TileHorde
{
	private List<Tiles> aliens;
	private boolean left = true;
	private boolean right = true;

	public TileHorde(int size)
	{
		int x = 50;
		int y = 30;
		aliens = new ArrayList<Tiles>();
		for(int i = 0; i<size; i++)
		{
			aliens.add(i, new Tiles(x, y, 40, 40, Color.red));
			x+=100;
			if(x>=700)
			{
				x=50;
				y+=50;
			}
		}
		x = 50;
		y = 450;
		for(int j = 0; j<size; j++)
		{
			aliens.add(j, new Tiles(x, y, 40, 40, Color.red));
			x+=100;
			if(x>=700)
			{
				x=50;
				y+=50;
			}
		}
		}

	public void add(Tiles al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(int i = 0; i<aliens.size(); i++)
		{
			aliens.get(i).draw(window);
		}
	}


	public Ball removeDeadOnes(Ball shots)
	{
		for(int j = aliens.size()-1; j>=0; j--){
				if(right == true){
					if(shots.getX()+shots.getWidth()+shots.getXSpeed() > aliens.get(j).getX() && shots.getX()+shots.getXSpeed() < aliens.get(j).getX()+aliens.get(j).getWidth()
							&& shots.getY() <= aliens.get(j).getY()+aliens.get(j).getHeight() && shots.getY()-shots.getHeight() >= aliens.get(j).getY()){
						aliens.remove(j);
						shots.setYSpeed(-shots.getYSpeed());
						return shots;
					}
				}
				else if(left == true){
					if(shots.getX()+shots.getWidth()-shots.getXSpeed() > aliens.get(j).getX() && shots.getX()-shots.getXSpeed() < aliens.get(j).getX()+aliens.get(j).getWidth()
							&& shots.getY() <= aliens.get(j).getY()+aliens.get(j).getHeight() && shots.getY()-shots.getHeight() >= aliens.get(j).getY()){
						aliens.remove(j);
						shots.setYSpeed(-shots.getYSpeed());
						return shots;
					}
				}
			}
		return null;
	}

	public int getSize() {
		return aliens.size();
	}
	
	public String toString()
	{
		return "";
	}
	}
