package ground;

import java.awt.*;

import gui.*;
import agent.*;

public class MainFrame {
	
	static MainFrameGui myGui;
	
	public static void main(String args[]){
		Agent[] list = new Agent[50];
		AgentGui[] guiList = new AgentGui[50];
		MainFrameGui myGui = new MainFrameGui();
		
		for(int i=0;i<50;i++){
			list[i] = new Agent("a"+i,3,i+2);
			guiList[i] = new AgentGui(list[i],myGui,5,5+5*i);
			list[i].setGui(guiList[i]);
//			guiList[i].paint(Graphics g);
		}
		
		for(int i=0;i<50;i++){
			list[i].start();
		}

		return;
	}
}
