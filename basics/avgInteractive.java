import java.io.*;
public class avgInteractive{
	public static void main(String [] args)throws IOException{
	int sum=0;	
	System.out.println("Enter the values you want to take average of ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				

		for(int i=0;i<5;i++)
		{ sum=sum+Integer.parseInt(br.readLine());
			}
		int avg=sum/5;
	System.out.println("Average is "+avg+" .");		
	}
}
