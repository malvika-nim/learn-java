import java.io.*;
public class returnValues{
	public static void main(String [] args) throws IOException{
		int x = findMax();
		x = makeDouble(x);
		System.out.println(x);
	}

	public static int findMax() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int first = Integer.parseInt(br.readLine());

		int second = Integer.parseInt(br.readLine());

		if(first>=second){ return first;}
		else return second;
		
	}

	public static int makeDouble(int y){
		return y*2;
	}
}
