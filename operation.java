import java.io.*;
public class operation{

	int first;
	int second;
	String operand;
	int answer;

	public void initialise(int a,int b, String c)throws IOException{
	   first=a;
	   second=b;
	   operand=c;
	   answer=0;
	}


	public void run(){
		if(operand.equals("add")) add();
		if(operand.equals("sub")) sub();
		if(operand.equals("mul")) mul();
		if(operand.equals("div")) div();
	}
	public void add(){
		answer=first+second; 
	}

	public void sub(){ 
		answer=first-second;  
	}

	public void mul(){ 
		answer=first*second;  
	}

	public void div(){ 
		answer=first/second;  
	}	
	
	public void printAns(){ 
		System.out.println("answer is "+answer);
	}
}
