import java.io.*;
public class testList{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List l = new List();
		while(true){
			String inputLine = br.readLine();
			String [] inputSplit = inputLine.split(" ");
			
			String op = inputSplit[0];
			int number = Integer.parseInt(inputSplit[1]);

			if(op.equals("+")) l.addNumber(number);
			if(op.equals("-")) l.deleteNumber(number);
			if(op.equals("p")) l.printList();
			if(op.equals("s")) System.out.println(l.getSize());
		}	
	}
}
