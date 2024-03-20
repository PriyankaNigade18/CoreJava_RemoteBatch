package oop.Inheritance;

class A
{
	public void m1()
	{
		System.out.println("M1() is calling!");
	}
}


class B extends A//A is parent and B is child-Single level Inheritance
{
	public void m2()
	{
		System.out.println("M2() is calling!");
	}
}

class C extends B//B is parent and c is child -Multilevel
{
	public void m3()
	{
		System.out.println("M3() is calling!");
	}
}
class D extends A//A is parent and D is child -Hierarchical
{
	public void m4()
	{
		System.out.println("M3() is calling!");
	}
}



public class InheritanceDemo {

	public static void main(String[] args)
	{
	System.out.println("Scenario1: Child class ref and child class Object");
	//Parent + child properties
//	B b1=new B();
//	b1.m1();
//	b1.m2();
	
//	C c1=new C();
//	c1.m1();//inherited
//	c1.m2();//inherited
//	c1.m3();//individual 
	
	D d1=new D();
	d1.m1();//inherited
	d1.m4();//Individual
	
	
	
	
	
	System.out.println("Scenario2:Parent class ref and Parent class Object");
	//Only Parent properties
	A a1=new A();
	a1.m1();
	
//	
//	B b1=new B();
//	b1.m1();
//	b1.m2();
	System.out.println("Scenario3:Parent class ref and Child class Object");
	//Only Parent Properties
//	A a2=new B();
//	a2.m1();
//	B b2=new C();
//	b2.m1();
//	b2.m2();
	
	A a2=new D();
	a2.m1();
	System.out.println("Scenario4:Child class ref and Parent class Object-Invalid");
	//B b2=new A(); invalid as java always do top casting
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
