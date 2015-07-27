import java.io.*;
public class controller{
	static Player p1,p2;
	static dice d;
	static int winningScore;
	static int p1Dice,p2Dice;
	static BufferedReader br;
	public static void initialise()throws IOException{
		 System.out.println("enter name for player 1:");
		br=new BufferedReader(new InputStreamReader(System.in)); 
		p1= new Player(br.readLine());
		System.out.println("enter name for player 2: "); 
		 p2=new Player(br.readLine());
		 d=new dice();
		 winningScore=10;
	}
	public static void main(String[] args)throws IOException{
		initialise();
		run();
	}
	
	public static void run()throws IOException{
		while(p1.getScore()<winningScore && p2.getScore()<winningScore){
			System.out.println("press Enter to roll dice. ");
			br.readLine();
			p1.takeTurn(d);
			p1Dice=d.getNumber();
			System.out.println("press enter to roll. ");
			br.readLine();
			p2.takeTurn(d);
			p2Dice=d.getNumber();
		
			if(p1Dice>p2Dice){
				p1.incrementScore(2);
			}
			else if(p2Dice>p1Dice){
				p2.incrementScore(2);
			}
			else {
				p1.incrementScore(1);
				p2.incrementScore(1);
			}
		
		if(p1.getScore()>p2.getScore()){System.out.println(p1.getName()+" has won!");}
		 else System.out.println(p2.getName()+" has won! ");
		}
	}
}
