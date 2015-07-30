public class testPlayer{
	public static void main(String[] args){
		Player p1=new Player("sunny");
		System.out.println("Enter player name:"+p1.getName());
		System.out.println(p1.getScore());
		p1.incrementScore(1);
		System.out.println(p1.getScore());
		dice D=new dice();
		p1.takeTurn(D);
		System.out.println(D.getNumber());
	}	
}
