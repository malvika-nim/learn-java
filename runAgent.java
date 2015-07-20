public class runAgent{
	public static void main(String [] args){
		agent j = new agent("j", -1, "Agent k is dead");

		j.printForTesting();
//access properties directly
// NOT SUCCESS, Since it is private
//		System.out.println(j.name);

//set property: FAILUIRE. SINCE name is private
//		j.taskId = 4;
//		System.out.println(j.getTaskId());
//set property using public setter
		j.setTaskId(4);
		System.out.println(j.getTaskId());

// ACCESS public thing: Success
		
		System.out.println(j.publicInfo);



//=>We can access 'public' attributes, but not 'private'
		
//Getter Method: SUCCESS
		System.out.println(j.getName());
//Getter Method: FAIL: Since its private
//		System.out.println(j.getPublic());
	}
}

// split vertically:  ":vsp <fileName>
// change between:  ctrl+w ctrl+w
//new tab in terminal: ctrl+shift+t
