public class hare implements Runnable{
	int distanceLeft = 100;
	public void run(){
		while(distanceLeft>0){
			System.out.println("Running 10 m");
			distanceLeft-=10;
			try{
				Thread.sleep(1);
			}
			catch(Exception e){
			}
		}
	}
}
