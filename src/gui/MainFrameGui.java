package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.*;

public class MainFrameGui extends JFrame implements ActionListener, MouseListener{
	private static final int FWIDTH = 700, FHEIGHT = 700;
	Vector<AgentGui> agentList = new Vector<AgentGui>();
	Rectangle rectangle;
	
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
	
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		g2.getBackground();
		g2.fillRect(0, 0, FWIDTH, FHEIGHT);
		//		g2.setBackground(Color.black);
//		g2.draw(rectangle);
		
		if(!agentList.isEmpty()){
			for(AgentGui agentGui:agentList){
				agentGui.paint(g2);
				//				agentGui.paint(g);
			}
		}		

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Called actionperformned");	
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Called MouseClicked");	
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Called MousePressed");	
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
