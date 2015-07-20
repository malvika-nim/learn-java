import java.io.*;
public class calculator{
	
	static int n1;
	static int n2;
	static int ans;
	static BufferedReader br;

	public static void main(String[] args)throws IOException{
	for(int i=0;i<5;i++)
		func();}
	  public static void func() throws IOException{
		System.out.println("Choose the desired operation from the following");
		System.out.println("MENU:\n1.Add\n2.Subtract\n3.Divide\n4.Multiply");
	
	
		int number;
		 br=new BufferedReader(new InputStreamReader(System.in));

		
		number=Integer.parseInt(br.readLine());
		if(number==1) 
			{add();}
		else
			if(number==2)
				{subtract();}
			else
				if(number==3)
					{div();}
				else
				     if(number==4)
						{multiply();}
				}
		
	

public static void add()throws IOException{
	System.out.println("Enter the numbers you want to add:");
	
	n1=Integer.parseInt(br.readLine());
	n2=Integer.parseInt(br.readLine());
	ans=n1+n2;
	System.out.println("Sum of "+n1+" and "+n2+" is: "+ans+" . ");
	}

public static void subtract()throws IOException {
	System.out.println("Enter the numbers you want to find difference of:");
	n1=Integer.parseInt(br.readLine());
	n2=Integer.parseInt(br.readLine());
	ans=n1-n2;
	System.out.println("Difference it:"+ans+" ");
	}

public static void div()throws IOException{
	System.out.println("Enter the dividend and the divisor:");
	n1=Integer.parseInt(br.readLine());
	n2=Integer.parseInt(br.readLine());
	ans=n1/n2;
	System.out.println("Quotient is:"+ans+" ");
	}

public static void multiply()throws IOException {
	System.out.println("enter the numbers you want the product of:");
	n1=Integer.parseInt(br.readLine());
	n2=Integer.parseInt(br.readLine());
	ans=n1*n2;
	System.out.println("Product is "+ans+" ");
	}

}
