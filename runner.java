public class runner{
	public static void main(String [] args){
		student s = new student();
		s.age	=10;
		s.classs=7;
		s.name 	= "Shyaam";
	
		System.out.println("Student's name "+s.tellName());
		System.out.println("Student's class "+s.classs+"age "+s.age);
		s.pass();
		System.out.println("Student's class "+s.classs+"age "+s.age);

		System.out.println(student.whatIsIt());
	}
}
