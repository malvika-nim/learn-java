import java.io.*;
public class global{
	
	static String [] names;
	static int [] marks;
	
	public static void main(String [] args) throws IOException{
		readNames();
		readMarks();
		printNames();
		printMarks();
		printTogether();
	}

	public static void readNames() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		names = new String[2];
		int i = 0;
		while(i<2){
			names[i] = br.readLine();
			i++;
		}
	}
	public static void readMarks() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		marks = new int[2];
		int i = 0;
		while(i<2){
			marks[i] = Integer.parseInt(br.readLine());
			i++;
		}
	}

	public static void printNames(){
		int i = 0;
		while(i<2){
			System.out.print(names[i]); 
			i++;
		}
	}

	
	public static void printMarks(){
		int i = 0;
		while(i<2){
			System.out.print(marks[i]);
			i++;
		}
	}

	public static void printTogether(){
		int i = 0;
		while(i<2){
			System.out.print(names[i]+" "+marks[i]);
			i++;
		}
	}
}
