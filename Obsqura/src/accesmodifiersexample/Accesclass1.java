package accesmodifiersexample;

public class Accesclass1 {
	public static char a='h';
	private static int c=20;
	protected static int h=90;
	 int x=45;//default variable
	public static void publicMethod1()
		{
			System.out.println("public");
			
		}
	 void defaultmethod()
	{
		System.out.println("default method");
	}
	public static void main(String[] args) {
		 
		System.out.println(Accesclass1.a);
		System.out.println(Accesclass1.c);
		System.out.println(Accesclass1.h);
		Accesclass1 obj1=new Accesclass1(); 
		obj1.defaultmethod();
		System.out.println(obj1.x);
	}

}
