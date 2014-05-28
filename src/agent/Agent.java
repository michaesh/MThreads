package agent;

import java.util.concurrent.*;
//import java.lang.Object.*;


public class Agent extends Thread{
	public String name;
	int number;
	int divisor;
	Semaphore stateChange = new Semaphore(1,true);

	/* Declarator, input: Name, Numerator and denominator
	 * Creates an agent to store the inputs
	 * */
	public Agent(String me,int num, int div){
		this.name = me;
		this.number = num;
		this.divisor = div;
	}
	
	/* Does numerical operation*/
	public void run() {
		while(number>1){
			number = number*divisor;
			msg("Numner:"+number);
		}
	}
	
	/* Standard output method, input: message in string 
	 * Output: The name of the agent and the message
	 * */
	public void msg(String message){
		System.out.println(name+": "+message);
	}
	
}