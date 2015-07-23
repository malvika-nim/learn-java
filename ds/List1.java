public class List1 implements IList1{
	private int[] numbArr;
	private int size;

	public List1(){
		numbArr=new int[100];
	
	}


	public void addNumber(int k){
		numbArr[size]=k;
		size++;
	}

	public void deleteNumber(int k){
		for(int i=0;i<size;i++){
			if(numbArr[i]==k){
//				System.out.println("matched" +i);
				for(int j=i;j<size;j++){
					numbArr[j]=numbArr[j+1];
//					System.out.println(" replacing "+numbArr[j]+ " by "+numbArr[j+1]+ " for j = " +i);
				}
			size=size-1;
			}
				
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
