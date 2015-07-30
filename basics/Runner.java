import java.io.*;
public class Runner{

	public static void main(String[] args) throws IOException{
		for(int i=0;;i++) func();
	}	
	public static void func() throws IOException{
		operation Op=new operation();
		System.out.println("what operation you want us to carr on with: 1.ADD   2.SUBTRACT  3.MULTIPLY  4.DIVIDE");
		int first, second;
		String operand;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		first=Integer.parseInt(br.readLine());
		second=Integer.parseInt(br.readLine());
		operand=br.readLine();

		Op.initialise(first, second, operand);
		Op.run();
		Op.printAns();
	}
}
