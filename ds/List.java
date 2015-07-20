public class List implements IList{
	
	private int [] numbArr;
	private int size; //also included elements

	public List(){
		numbArr = new int[100];
	}

	public void addNumber(int k){
		numbArr[size] = k;
		size++;
	}

	public void deleteNumber(int k){
		for(int i=0;i<size;i++){
			if(numbArr[i]==k) numbArr[i] = -1;
		}
	}

	public int getSize(){
		return size;
	}

	public void printList(){
		for(int i=0;i<size;i++){
			System.out.print(numbArr[i]+" ");
		}
		System.out.println();
	}
}
