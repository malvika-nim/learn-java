public class printInt{
	public static void main(String [] args){
		String first = args[0];
		String second = args[1];

		System.out.println(first);
		System.out.println(second);
	
		int firstInt = Integer.parseInt(first);
		int secondInt = Integer.parseInt(second);

		int sum = firstInt + secondInt; 
	
		System.out.println(firstInt);
		System.out.println(secondInt);
		System.out.println(sum);
	}
}
