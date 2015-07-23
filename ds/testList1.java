import java.io.*;
public class testList1{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List1 l=new List1();
		while(true){
			String inputLine=br.readLine();
			String [] inputSplit= inputLine.split(" ");
			String op=inputSplit[0];
			int number=Integer.parseInt(inputSplit[1]);
			
			if(op.equals("+")) l.addNumber(number);
			if(op.equals("-")) l.deleteNumber(number);
			if(op.equals("p")) l.printList();
			if(op.equals("s")) System.out.println(l.getSize());
		}
	}
}
