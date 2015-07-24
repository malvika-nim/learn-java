public class runner{
	public static void main(String [] args) throws Exception{
		Thread h = new Thread(new hare());
		Thread t = new Thread(new turtle());
		t.start();
		h.start();

	}
}
