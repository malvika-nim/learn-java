public class runInheritance{
	public static void main(String [] args){
		mammal m = new mammal();
		m.printProperties();
		System.out.println(m instanceof mammal);

		System.out.println(m instanceof human);
		
		human h = new human();
		h.printProperties();
		System.out.println(h instanceof mammal);
		System.out.println(h instanceof human);
}
}
