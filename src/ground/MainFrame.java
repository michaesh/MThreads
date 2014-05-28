package ground;

import gui.MainFrameGui;
import agent.*;

public class MainFrame {
	
	
	
	public static void main(String args[]){
		Agent[] list = new Agent[50];
		
		for(int i=0;i<50;i++){
			list[i] = new Agent("a"+i,3,i+2);
		}
		
		for(int i=0;i<50;i++){
			list[i].start();
		}
		MainFrameGui frame = new MainFrameGui();
		return;
	}
}
