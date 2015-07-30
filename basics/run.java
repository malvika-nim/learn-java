import java.io.*;
public class run{
	public static void main(String [] args) throws IOException{
		teacher Malvi = new teacher();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int first, second, ansByStudent;
		boolean correct;
		
		for(int i=1;i<=4;i++){
			first = Malvi.giveFirst();
			System.out.println("The first number: "+first);
		
			second = Malvi.giveSecond();
			System.out.println("The second number: "+second);

			System.out.println("Enter the sum");

			ansByStudent = Integer.parseInt(br.readLine());
			correct = Malvi.isCorrect(ansByStudent);

			if(correct) System.out.println("Great, correct answer");
			else System.out.println("Sorry, incorrect!");
		}

		Malvi.printReport();
}
}
