package gui;

import java.awt.*;
import javax.swing.JFrame;

public class mainFrame extends JFrame{
	private static final int FWIDTH = 700, FHEIGHT = 700;
	
	public mainFrame(){
//		JFrame frame = new JFrame("Frame Demo");
		this.setPreferredSize(new Dimension(FWIDTH,FHEIGHT));
		this.setMinimumSize(new Dimension(FWIDTH,FHEIGHT));
		this.setVisible(true);
		this.setLayout(new BorderLayout());
		return;
	}
	
}
