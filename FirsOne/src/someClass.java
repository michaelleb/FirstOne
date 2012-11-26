
public class someClass {

	protected int privateValue = 19;
	
	int x;
	int y;
	public int getReadOnlyX(){
		
//		int temp = this.x;
//		return temp;
		return this.x;
	}
	public void setX(int x){
		this.x = x;
	}
	public void print(){
		System.out.println("my value is: " + privateValue);
	}
}
