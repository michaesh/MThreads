package gui;

import agent.*;

public class AgentGui {
	Agent myAgent;
	int xloc, yloc;
	
	/* Declarator, input: corresponding agent 
	 * */
	public AgentGui (Agent theAgent, int x, int y){
		myAgent = theAgent;
		xloc = x;
		yloc = y;
	}
	
	/* Moving function for Gui image, input: movement in 2 axis
	 * */
	public void move(int x, int y){
		xloc += x;
		yloc += y;
	}


	
}
