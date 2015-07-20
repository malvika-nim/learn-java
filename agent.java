public class agent{
//properties
	private String name;
	private String info;	
	private int taskId;
	private int inaccessible = 0;
	public String publicInfo ="public";
//Constructor
	public agent(String name, int taskId, String info){
		this.name = name;
		this.taskId = taskId;
		this.info = info;
	}

//private Accessor for testing

	private String getPublic(){
		return publicInfo;
	}

//Accessor
	public String getName(){
		return name;
	}

	public int getTaskId(){
		return taskId;
	}

//Setter
	public void setTaskId(int newId){
		taskId = newId;
	}

	public void printForTesting(){
		System.out.println("name: "+name);
		System.out.println("taskId: "+this.taskId);
		System.out.println("info: "+this.info);
	}
}
