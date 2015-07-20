import java.io.*;
public class file{

	public static void main(String[] args)throws IOException{
		funcReadline();
		
	}

	public static void funcReadline() throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("abc.txt"));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(new FileOutputStream("out.txt")));
		
		String line,line1;
		while((line=br.readLine())!=null){
			System.out.print(line);
			bw.write(line);
			line1=br.readLine();
			
			if(line1!=null){
			
				System.out.println(line1);
				bw.write(line1);
				bw.newLine();			
			}
		}
	
		bw.close();

	}
}
