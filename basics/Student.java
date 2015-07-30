public class Student{
	int first,second,ans;
		

	public void setFirst(int x){
		 // x=Malvi.giveFirst();
		 first=x;
	}

	public void setSecond(int y){
		//y=Malvi.giveSecond();
		second=y;
	}

	public int returnAns(){
		ans=first+second;
		if(ans % 2 ==1) ans=ans+1;
		return ans;
	}
}
