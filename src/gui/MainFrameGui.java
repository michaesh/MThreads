package gui;

import java.awt.*;
import javax.swing.*;

public class MainFrameGui extends JFrame{
	private static final int FWIDTH = 700, FHEIGHT = 700;
	AgentGui[] agentList;
	
	public MainFrameGui(){
//		JFrame frame = new JFrame("Frame Demo");
		this.setPreferredSize(new Dimension(FWIDTH,FHEIGHT));
		this.setMinimumSize(new Dimension(FWIDTH,FHEIGHT));
		this.setVisible(true);
		this.setLayout(new BorderLayout());
		return;
	}
	
	public void msgDisplayBox(){
		JButton mybutton = new JButton("My Button");
		this.add(mybutton);
	}
	
	
}
