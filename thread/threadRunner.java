public class threadRunner{
	public static void main(String [] args){
//		Thread t1 = new Thread();//can pass class in which is runnable
		Thread t1 = new Thread(new myThread("one"));
		Thread t2 = new Thread(new myThread("two"));
		Thread t3 = new Thread(new myThread("three"));
		Thread t4 = new Thread(new myThread("four"));

		t1.start(); //Starting a thread
		t2.start();
		t3.start();
		t4.start();

// Unlike function call, the threads will run parallal
/* Output of functions call
	t1 is sleeping
	t1 came out

	t2 is sleeping
	t2 came out
	
	t3 is sleeping
	t3 came out

	t4 is sleeping 
	t4 came out

*/
	}
}
/* Random order, not one after the other.
Thread two Sleeping for 9024
Thread four Sleeping for 1707
Thread three Sleeping for 1231
Thread one Sleeping for 7931
Thread three came out of sleep.
Thread four came out of sleep.
Thread one came out of sleep.
Thread two came out of sleep.
*/
