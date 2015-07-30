public class Player{
	
	private String name;
	private int score;

	
	public Player(String x){
		this.name=x;
		score=0;
	}
	
	public String getName(){
		return name;
	}

	public int getScore(){
		return score;
	}

	public void incrementScore(int inc){
		score=score+inc;
	}
	
	public void takeTurn(dice d){
		d.roll();	
	}
}
