package inheritance;

public class SuperChildOB extends SuperParentOB{
   
	public SuperChildOB()
	{
		  super(9,8.9f);
		System.out.println("ccccc");
	}
	public void display()
	{
		
		System.out.println("child class method");
		System.out.println(super.a);//VERUM a vilichalum may
		System.out.println(super.b);
		super.print();
		
	}
	public static void main(String[] args) {
		 
		SuperChildOB obj=new SuperChildOB();
		obj.display();
	//SuperParent obj1=new SuperParent();
		
		//obj.print();
	}

}
