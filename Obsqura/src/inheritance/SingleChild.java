package inheritance;

public class SingleChild extends SingleParent {

	
	public static void print()
	{
		System.out.println("method in child class");
	}
	public static void main(String[] args) {
	 
		System.out.println(a);
		SingleChild.print();
		
		SingleParent.add(20,45);
		
		
	}

}
