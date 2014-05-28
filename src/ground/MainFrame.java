package ground;

import gui.MainFrameGui;
import agent.*;

public class MainFrame {
	
	MainFrameGui myGui;
	
	public static void main(String args[]){
		Agent[] list = new Agent[50];
		
		for(int i=0;i<50;i++){
			list[i] = new Agent("a"+i,3,i+2);
		}
		
		for(int i=0;i<50;i++){
			list[i].start();
		}
		MainFrameGui myGui = new MainFrameGui();

		return;
	}
}
