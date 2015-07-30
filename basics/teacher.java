import java.util.Random;
<<<<<<< HEAD

public class teacher{
	int numOfQsAsked;
	int numOfCorrect;

	int first;
	int second;
	Random RandomInt;

	public teacher(){
		numOfQsAsked = 0;
		numOfCorrect = 0;
		RandomInt = new Random();
	}

	public int giveFirst(){
		int randNum = RandomInt.nextInt(100);
		first = randNum;
		return first;
	}

	public int giveSecond(){
		int randNum = RandomInt.nextInt(200);
		second = randNum;
		return second;
	}

	public boolean isCorrect(int ans){
		numOfQsAsked++;
		boolean correct = (first+second==ans);
		if(correct) numOfCorrect++;
		return correct;
	}

	public void printReport(){
		System.out.println("The report :"+numOfCorrect+"/"+numOfQsAsked);
	}
=======
public class teacher{

		int numOfQsAsked;
		int numOfCorrect;

		int first;
		int second;
		Random RandomInt;

		
		public teacher(){
			numOfQsAsked=0;
			numOfCorrect=0;
			RandomInt= new Random();
		
		}

		public int giveFirst(){
			int randNum=RandomInt.nextInt(100);
			first=randNum;
			return first;
		}

		public int giveSecond(){
			int randNum=RandomInt.nextInt(200);
			second=randNum;
			return second;
		}

		public boolean isCorrect(int ans){
			numOfQsAsked++;
			boolean correct=(first+second==ans);
			
			if(correct)
				numOfCorrect++;
				return correct;
		}

		public void printReport(){
			System.out.println("The report: "+numOfCorrect+"/"+numOfQsAsked);
		}

>>>>>>> 6336e9b90d5955a51336ff46f4d3632267d723ad
}
