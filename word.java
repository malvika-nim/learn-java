import java.io.*;
public class word{
	public static void main(String[] args)throws IOException{
	  System.out.println("enter the desired words ");
	  
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 	  		String[] wordsarray=new String[3]; 
			
		for(int i=0;i<3;i++)
		{// String w1=br.readLine();
		  wordsarray[i]=br.readLine();

//		  System.out.print(i);
		  //System.out.println(w1);
//		System.out.println(wordsarray[i]);
		}
		
		for(int i=0;i<3;i++)
		{System.out.print(i);
		 System.out.println(wordsarray[i]);}		

	}
}
