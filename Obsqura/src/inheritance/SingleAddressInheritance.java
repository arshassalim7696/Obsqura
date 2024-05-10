package inheritance;

public class SingleAddressInheritance extends SingleInheritanceStudent{
    
	public static void studAddress()
	{
		String address="aaaaaaaaaaa aaa aa";
				System.out.println("Student address is :" +address);
	}
	public static void main(String[] args) {
		
		
		
		SingleInheritanceStudent obj =new SingleInheritanceStudent();
		SingleAddressInheritance.studAddress();
		obj.print();
		 
	}

}
