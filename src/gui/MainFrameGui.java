package gui;

import java.awt.*;
import java.util.Vector;

import javax.swing.*;

public class MainFrameGui extends JFrame{
	private static final int FWIDTH = 700, FHEIGHT = 700;
	Vector<AgentGui> agentList = new Vector<AgentGui>();
	
	
	public MainFrameGui(){
//		JFrame frame = new JFrame("Frame Demo");
		this.setPreferredSize(new Dimension(FWIDTH,FHEIGHT));
		this.setMinimumSize(new Dimension(FWIDTH,FHEIGHT));
		this.setVisible(true);
		this.setLayout(new BorderLayout());
//		this.display();
		return;
	}
	
	public void msgDisplayBox(){
		JButton mybutton = new JButton("My Button");
		this.add(mybutton);
	}
	
	public void addAgentGui(AgentGui g){
		agentList.add(g);
		return;
	}
	
	public void display(){
		if(!agentList.isEmpty()){
			for(AgentGui agentGui:agentList){
				agentGui.paint(null);
			}
		}		
	}
}
