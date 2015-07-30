public class exceptions{
	public static void main(String [] args) throws Exception{
		if (args.length>2){
			throw new Exception("Only accepts 2 length inputs.");
		}

		try{
			firstWay(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Please provide 2 inputs");
		}
		catch (NumberFormatException e){
			System.out.println("Please make sure inputs are integers");
		}
		catch(Exception e){
			System.out.println("Error not planned for-");
			e.printStackTrace();
		}
		System.out.println("end");
	}
	
	public static void firstWay(int a, int b){

		try{
			System.out.println(a/b);
		}
		catch(Exception e){
			System.out.println("Sorry, you tried dividing by 0, which is undefined");
		}
		System.out.println("Goodbye, program exiting. Thanks for your time.");
	}
}
