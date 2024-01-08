package week1_Basics;

public class AccessModifier 
{
	//data
	int id=101;//default access modifier
	public String name="Sarang";//public access modifier
	private long phno=9897976699L;//private access modifier
	

	public static void main(String args[])
	{
		//within same class
		AccessModifier a1=new AccessModifier();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
	}
}
