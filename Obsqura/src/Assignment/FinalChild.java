package Assignment;

public class FinalChild extends FinalParent {

	
	
	final int b=400;
	public  void print(int a,char c)
	{
		//b=78;
		
		System.out.println(c);
		System.out.println(a);
		super.print(100, 'k');
	}
	
	public static void main(String[] args) {
		 
		FinalChild obj= new FinalChild();
		obj.print(10,'h');
		/*FinalParent obj1=new FinalParent();
		obj1.print(10,'j');*/
	}

}
