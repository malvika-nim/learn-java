public class runner{
	public static void main(String [] args) throws Exception{
		hare h = new hare();
		turtle t = new turtle();
		while(t.distanceLeft>0){
			t.run();
		}
		while(h.distanceLeft>0){
			h.run();
		}

	}
}
