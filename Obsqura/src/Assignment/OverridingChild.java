package Assignment;

public class OverridingChild extends OveridingParent{

	
	
	public   void print(int a,char c)
	{
		System.out.println(c);
		System.out.println(a);
		super.print(100, 'k');
	}
	
	public static void main(String[] args) {
		 
		OverridingChild obj= new OverridingChild();
		obj.print(10,'h');
	
	}

}
