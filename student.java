public class student{
	String name;
	int classs;
	int age;

	public static String whatIsIt(){
		return "student class";
	}
	public void pass(){
		classs++;
		age++;
	}
	
	public void fail(){
		age++;
	}

	public String tellName(){
		return name;
	}

	public int tellAge(){
		return age;	
	}
	
	public int tellClass(){
		return classs;
	}
	
}
