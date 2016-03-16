// Lab17bvst.java
// The student, starting version of the Lab17b assignment.


import java.awt.*;
import java.applet.*;


public class Lab17bvst extends Applet
{

	public void paint (Graphics g)
	{
		//test purposes
		g.drawLine(500,0,500,650);
		g.drawLine(0, 325, 1000, 325);
		
		
		drawSquare1(g,1000,650);
		count(1000,650,g);
		
	}


	public void drawSquare1(Graphics g, int maxX, int maxY)
	{
		int midX = maxX/2;
		int midY = maxY/2;
		int startWidth = maxX/3;
		int startHeight = maxY/3;
		int tlX = midX - (startWidth/2);
		int tlY = midY - (startHeight/2);
		g.fillRect(tlX,tlY,startWidth,startHeight);
	}
	
	public void count(int maxX, int maxY, Graphics g)
	{

			//countright(maxX,maxY,g);
			countleft(maxX,maxY,g);
			countbottomright(maxX,maxY,g);
			countbottomleft(maxX,maxY,g);
		
	}
	
	private void countbottomleft(int a, int b, Graphics g) {
		// TODO Auto-generated method stub
		
	}


	private void countbottomright(int a, int b, Graphics g) {
		// TODO Auto-generated method stub
		
	}


	public void countleft(int maxX,int maxY, Graphics g)
	{
		
			maxX = maxX / 2;
			maxY = maxY / 2;
			int midX = maxX/2;
			int midY = maxY/2;
			int startWidth = maxX/2;
			int startHeight = maxY/2;
			int tlX = midX - (startWidth/2);
			int tlY = midY - (startHeight/2);
			g.fillRect(tlX,tlY,startWidth,startHeight);
		
			//countleft(maxX,maxY,g);
			
			
			
			
		
		
	}
	
	public void countright(int maxX,int maxY, Graphics g)
	{
		
			maxX = maxX / 2;
			maxY = maxY / 2;
			int midX = maxX / 2;
			int midY = maxY / 2;
			int startWidth = maxX/3;
			int startHeight = maxY/3;
			int tlX = midX - (startWidth/2);
			int tlY = midY - (startHeight/2);
			g.fillRect(tlX,tlY,startWidth,startHeight);
		
			if(startWidth != 0){
				if(startHeight!= 0){
					countright(maxX,maxY,g);
				}
			}
			
		
		
	}


	public void delay(long n)
	{
		n *= 1000;
		long startDelay = System.nanoTime();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.nanoTime();
	}

}

