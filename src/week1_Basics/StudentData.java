package week1_Basics;

public class StudentData
{

	//data
	int id;
	String name;
	
	//method
	public void show()
	{
		System.out.println("Student id is: "+id);
		System.out.println("Student name is:  "+name);
	}
	public static void main(String[] args) 
	{
		//create object to access anything from class
		
		StudentData s1=new StudentData();
		s1.id=101;
		s1.name="Reva";
		//calling method
		s1.show();
		
		System.out.println("**********************");
		
		StudentData s2=new StudentData();
		s2.id=102;
		s2.name="Swara";
		s2.show();
		
	

	}

}
