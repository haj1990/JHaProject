//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int leftScore;
	private int rightScore;
	private Wall top, right, bottom, left;
	private TileHorde tiles;
	private TileHorde2 tiles2;


	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball(100,100,10,10,Color.blue,3,3);
		rightPaddle = new Paddle(400,500,40,40,Color.orange,3);
		
		top = new Wall(0, 0, 800, 10, Color.yellow);
		bottom = new Wall(0, 551, 800, 10, Color.yellow);
		left = new Wall(0, 10, 10, 541, Color.yellow);
		right = new Wall(775, 10, 10, 541, Color.yellow);
		
		tiles = new TileHorde(14);
		tiles2 = new TileHorde2(10);


		keys = new boolean[4];
		leftScore = 0;
		rightScore = 0;

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		
		graphToBack.clearRect(0, 0, 800, 600);

		ball.moveAndDraw(graphToBack);
		rightPaddle.draw(graphToBack);
		top.draw(graphToBack);
		right.draw(graphToBack);
		left.draw(graphToBack);
		bottom.draw(graphToBack);
		tiles.drawEmAll(graphToBack);
		tiles.removeDeadOnes(ball);
		tiles2.drawEmAll(graphToBack);
		tiles2.removeDeadOnes(ball);
		
		if (tiles.getSize() == 0 && tiles2.getSize() == 0) {
			tiles = new TileHorde(14);
			tiles2 = new TileHorde2(10);
			ball.moveAndDraw(graphToBack);
			rightPaddle.draw(graphToBack);
			top.draw(graphToBack);
			right.draw(graphToBack);
			left.draw(graphToBack);
			bottom.draw(graphToBack);
			tiles.drawEmAll(graphToBack);
			tiles.removeDeadOnes(ball);
			tiles2.drawEmAll(graphToBack);
			tiles2.removeDeadOnes(ball);
		}

		//see if ball hits left wall or right wall
		if (ball.didCollideLeft(left) || ball.didCollideRight(right)){
			ball.setXSpeed(-ball.getXSpeed());
		
		}
		
		//see if the ball hits the top or bottom wall 
		if(ball.didCollideTop(top) || ball.didCollideBottom(bottom))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		 
		//see if the paddles need to be moved

		if (ball.didCollideLeft(rightPaddle) || ball.didCollideRight(rightPaddle)){
			ball.setXSpeed(-ball.getXSpeed());
		}
			
			
		else if (ball.didCollideTop(rightPaddle) || ball.didCollideBottom(rightPaddle)){
			ball.setYSpeed(-ball.getYSpeed());
			ball.setXSpeed(-ball.getXSpeed());
			
		}
		
		if (ball.intersects(rightPaddle)) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		
		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			rightPaddle.moveLeftAndDraw(window);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			rightPaddle.moveRightAndDraw(window);

		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(window);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(window);
		}


		twoDGraph.drawImage(back, null, 0, 0);
		
		
	}

	private int abs(int xSpeed) {
	// TODO Auto-generated method stub
	return 0;
}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'J' : keys[0]=true; break;
			case 'L' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'J' : keys[0]=false; break;
			case 'L' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}