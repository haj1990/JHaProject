//� A+ Computer Science  -  www.apluscompsci.com
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


	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball(10,100,10,10,Color.blue,2,1);
		leftPaddle = new Paddle(20,200,10,40,Color.orange,2);
		rightPaddle = new Paddle(760,200,10,40,Color.orange,2);
		
		top = new Wall(0, 0, 800, 10, Color.white);
		bottom = new Wall(0, 551, 800, 10, Color.white);
		left = new Wall(0, 10, 10, 541, Color.white);
		right = new Wall(774, 10, 10, 541, Color.white);


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
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		top.draw(graphToBack);
		right.draw(graphToBack);
		left.draw(graphToBack);
		bottom.draw(graphToBack);

		
		graphToBack.setColor(Color.RED);
		graphToBack.drawString("Left " + (leftScore), 350, 500);
		graphToBack.drawString("Right " + (rightScore), 350, 520);

		//see if ball hits left wall or right wall
		if (ball.didCollideLeft(left) || ball.didCollideRight(right)){
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			if (ball.didCollideLeft(left)){
				rightScore += 1;
			}
			if (ball.didCollideRight(right)){
				leftScore += 1;
			}
			
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Left " + (leftScore - 1), 350, 500);
			graphToBack.drawString("Right " + (rightScore - 1), 350, 520);
			graphToBack.setColor(Color.RED);
			graphToBack.drawString("Left " + (leftScore), 350, 500);
			graphToBack.drawString("Right " + (rightScore), 350, 520);
		
			ball.draw(graphToBack, Color.WHITE);
			ball.setX(400);
			ball.setY(300);
			ball.setColor(Color.BLUE);
			
			ball.setXSpeed(3);
			ball.setYSpeed(1);
		}
		
		//see if the ball hits the top or bottom wall 
		if(ball.didCollideTop(top) || ball.didCollideBottom(bottom))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		 
		//see if the paddles need to be moved

		if (ball.didCollideLeft(leftPaddle) || ball.didCollideRight(rightPaddle)){
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		
		else if (ball.didCollideTop(leftPaddle) || ball.didCollideBottom(leftPaddle)){
			ball.setYSpeed(-ball.getYSpeed());
			ball.setXSpeed(-ball.getXSpeed());
			
			
		}
		else if (ball.didCollideTop(rightPaddle) || ball.didCollideBottom(rightPaddle)){
			ball.setYSpeed(-ball.getYSpeed());
			ball.setXSpeed(-ball.getXSpeed());
			
		}
		
		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(window);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			leftPaddle.moveDownAndDraw(window);

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
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
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