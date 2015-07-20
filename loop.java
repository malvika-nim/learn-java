<<<<<<< HEAD

public class loop{
	public static void main(String[] args){
		System.out.println(args.length);
		 
		for(int i=0;i<args.length;i++){
		System.out.print(args[i]);
			System.out.println(args[i]);
		}
		}
	}
=======
public class loop{
	public static void main(String [] args){
		System.out.println(args.length);

		for(int i=args.length-1;i>=0;i--){
			System.out.println(args[i]);
		}

		for(int i=0;i<args.length;i++){
			System.out.println(args[ args.length-1 -i]);
		}

	}
}
>>>>>>> 6336e9b90d5955a51336ff46f4d3632267d723ad
