public class testDice{
	public static void main(String[] args){
	//testing constructor
		dice D=new dice();
		System.out.println(D.getNumber());

		for(int i=0;i<=30;i++){
			D.roll();
			System.out.println(D.getNumber());
		}
	}
}
