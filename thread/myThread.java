// Thread t = new Thread();
// Thread t =  new Thread(<Runnable Object>);
// Runnable object: An object of a class which implements Runnable: run() method define is necessary


import java.util.*;
public class myThread implements Runnable{
	//only one method it has is run

	String name;
	int sleepTime;
	Random r = new Random();

	public myThread(String x){
		name = x;
		sleepTime = r.nextInt(9999);
	}

	public void run(){
	//gets called whenever called the thread
		try{
			System.out.println("Thread "+name+" Sleeping for "+sleepTime);
			Thread.sleep(sleepTime);
			System.out.println("Thread "+name+" came out of sleep.");
		}
		catch(Exception e){
		}
	}
}
