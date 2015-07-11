public class average{
	public static void main(String[] args){
int sum=0;		
for(int i=0;i<args.length;i++)
			{ System.out.println(args[i]);}	
		for(int i=0;i<args.length;i++)
			{ 
				sum=sum+Integer.parseInt(args[i]);
			System.out.println(sum); }
	int avg;	
	avg=sum/args.length;
	System.out.println(avg);
}}
