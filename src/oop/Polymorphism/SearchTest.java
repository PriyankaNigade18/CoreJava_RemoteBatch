package oop.Polymorphism;

public class SearchTest {

	public static void main(String[] args) 
	{

		AmazonSearch a1=new AmazonSearch();
		a1.search("Iphone");
		a1.search(200000);
		a1.search("Bag","Zara");
		a1.search(10000, "watch");
		a1.search("mobile",20000);
		

	}

}
