import java.io.InputStreamReader;
import java.io.BufferedReader;
public class ageInteractive2{
	public static void main(String [] args)throws java.io.IOException{
		System.out.println("What is your age?");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String age=br.readLine();
		System.out.println("So you are "+age+" years old.");
	}
}

