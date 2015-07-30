public class answer{

	public static void main(String[] args){
	
		adder A=new adder();
		A.initialise(2,4);
		A.run();

		
		System.out.println(A.prod);	
		A.initialise(16,10);
		System.out.println(A.prod);	
		A.run();


		
		System.out.println(A.prod);	
	}
}
