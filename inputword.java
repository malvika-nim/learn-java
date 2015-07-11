import java.io.*;
public class inputword{
	public static void main(String[] args)throws IOException{
	System.out.println("number of words you want to enter?");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int number=Integer.parseInt(br.readLine());
        	String[] word1=new String[number];

		for(int i=0;i<number;i++)
		{ word1[i]=br.readLine();}

		for(int i=0;i<number;i++)
		{ System.out.print(i);
		  System.out.println(word1[i]);}	

	}
}
