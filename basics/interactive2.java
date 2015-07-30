
public class interactive2{
	public static void main(String [] args) throws java.io.IOException{
		System.out.println("Hello, what's your name buddy?");
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		String name = br.readLine();

		System.out.println("Hi, "+name+". Nice to meet you.");
	}
}
