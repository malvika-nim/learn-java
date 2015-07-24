public class turtle implements Runnable{
	int distanceLeft = 100;
	public void run(){
		while(distanceLeft>0){
			System.out.println("Running 5 m");
			distanceLeft-=5;
			try{
				Thread.sleep(1);
			}
			catch(Exception e){
			}
		}
	}
}
