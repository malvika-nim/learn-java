import java.io.*;
public class Run{
	public static void main(String[] args) throws IOException{
		teacher Malvi=new teacher();
		Student sunny=new Student();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int first,second,ansByStudent;
		boolean correct;
		
		for(int i=0;i<=4;i++){
			first=Malvi.giveFirst();
			System.out.println("the first number:"+first);
			sunny.setFirst(first);
		
			second=Malvi.giveSecond();
			System.out.println("the second number:"+second);
			sunny.setSecond(second);

			ansByStudent=sunny.returnAns();
			System.out.println("Student's answer: "+ansByStudent);
			correct=Malvi.isCorrect(ansByStudent);

		
			if(correct)
				System.out.println("CORRECT!!!");
			else  
				System.out.println("SORRY,INCORRECT.");

			
		}
	  Malvi.printReport();
	}

}
