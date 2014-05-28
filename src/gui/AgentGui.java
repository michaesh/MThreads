package gui;

import java.awt.*;
import agent.*;


public class AgentGui {
	Agent myAgent;
	MainFrameGui mainframe;
	private int xsize = 20, ysize = 20;
	private int xloc, yloc;
	Rectangle rectangle;
	
	
	
	/* Declarator, input: corresponding agent 
	 * */
	public AgentGui (Agent theAgent, MainFrameGui main, int x, int y){
		myAgent = theAgent;
		mainframe = main;
		this.xloc = x;
		this.yloc = y;
		rectangle = new Rectangle(xloc,yloc,xsize,ysize);

	}
	
	/* Moving function for Gui image, input: movement in 2 axis
	 * */
	public void move(int x, int y){
		xloc += x;
		yloc += y;
	}

	public void paint(Graphics2D g){
		g.draw(rectangle);
		g.drawString(myAgent.getAgentName(), xloc, yloc);
	}

	
}
