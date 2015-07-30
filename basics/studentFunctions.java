import java.io.*;
public class studentFunctions{
	public static void main(String[] args)throws IOException{
		
		
		String[] Name=readName();				
		int [] Marks=readMarks();
		nameMarks(Name,Marks);
		}
		public static String[] readName()throws IOException{
		System.out.println("Enter student's name");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String [] name=new String[5];
		for(int i=0;i<5;i++)
		{ name[i]=br.readLine();  }
		
		return name;
		}
	
		public static int [] readMarks()throws IOException{
		int[] marks=new int[5];		
		System.out.println("Enter marks");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<5;i++)
		{ marks[i]=Integer.parseInt(br.readLine()); }	  
		return marks;
		}
		
		public static void nameMarks(String[] Name,int [] Marks){
		System.out.println("name and marks of student are:");
		for(int i=0;i<5;i++){
		System.out.print(Name[i]);
		System.out.println(Marks[i]);}}
}

	
