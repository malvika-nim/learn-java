import java.util.Random;
public class dice{

	private int number;
	Random RandomInt;
	
	public dice(){
		number=-1;
		RandomInt= new Random();
	}

	public int getNumber(){
		//int randNum=RandomInt.nextInt(6);
		//number=randNum;
		return number;
	}

	public void roll(){
		number=RandomInt.nextInt(6)+1;
	}
}
