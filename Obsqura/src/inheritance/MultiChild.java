package inheritance;

public class MultiChild extends MultiParent{

	public static void sub()
	{
		int f=56;
		int g=76;
		System.out.println(f-g);
	}
	
	
	
	public static void main(String[] args) {
		
		MultiParent.add();
		MultiGrandParent.print();
		MultiChild.sub();
	}

}
