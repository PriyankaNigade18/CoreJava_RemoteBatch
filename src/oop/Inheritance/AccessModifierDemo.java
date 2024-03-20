package oop.Inheritance;

public class AccessModifierDemo
{
	int id=101;
	public String name="Jay";
	private long phno=9876544377L;
	protected int acno=6666666;
			

	public static void main(String[] args) 
	{
		// Same class

		AccessModifierDemo a1=new AccessModifierDemo();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
		System.out.println(a1.acno);
	}

}
