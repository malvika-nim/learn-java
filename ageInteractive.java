import java.io.*;
public class ageInteractive{
	public static void main(String [] args)throws IOException{
		System.out.println("What is your age?");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String age=br.readLine();
		System.out.println("So you are "+age+" years old.");
	}
}

