package week2_Basics;

public class ThisKeywordDemo2 
{
	//this keyword used to invoked method
	public void m1()
	{
		System.out.println("M1 calling!");
		//this.m2();
		m2();//this.m2()
	}
	public void m2()
	{
		System.out.println("m2 calling!");
		m3();//this.m3()
	}
	public void m3()
	{
		System.out.println("M3 calling");
		//m1();//.StackOverflowError(deadlock)
	}

	public static void main(String[] args)
	{
		ThisKeywordDemo2  t1=new ThisKeywordDemo2 ();
		t1.m1();

	}

}
