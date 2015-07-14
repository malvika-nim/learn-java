public class printSameLine{
	public static void main(String [] args){
		String first = args[0];
		String second = args[1];

		System.out.println(first+second); //+ concatenate strings
		System.out.println(first+" "+second); //+ concatenate space in between

		int firstInt = Integer.parseInt(first);
		int secondInt = Integer.parseInt(second);

		System.out.println(firstInt+secondInt); //+ is add in integers
		System.out.println(String.valueOf(firstInt)+String.valueOf(secondInt)); //+ is add in integers
		System.out.println(firstInt+" "+secondInt); //+ is add in integers
		System.out.println("firstInt "+firstInt+" secondInt"+secondInt); //+ is add in integers
		
	}
}
