import java.io.*;
public class fileIO{

	public static void main(String [] args) throws IOException{
		secondMethod();
	}

	public static void secondMethod() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));

		//FileOutputStream fos = new FileOutputStream("out.txt");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("out.txt")));
		
		String line;
		while((line=br.readLine())!=null){
			System.out.println(line);
			bw.write(line);bw.newLine();
		}
		bw.close();
	}

	/*
		For writing to a file, from another file
	*/
	public static void firstMethod() throws IOException{
		FileInputStream in = new FileInputStream("abc.txt");
		FileOutputStream out = new FileOutputStream("out.txt");

		int c;
		while((c=in.read())!=-1) {
			out.write(c);
			System.out.println(c);
		}
	}
}
