import java.io.*;

public class interactive{
	public static void main(String [] args) throws java.io.IOException{
		System.out.println("Hello, what's your name buddy?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();

		System.out.println("Hi, "+name+". Nice to meet you.");
	}
}
