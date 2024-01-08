package week2_Basics;

public class StudentBasicVariableScenario
{
	int id;//instance
	String name;//instance
	static String clgName="AISSPMS";//static
	
	public void marks(int marks1)//local
	{
		System.out.println("Extra marks:"+(marks1+10));
		
	}
	
	public void show()
	{
		System.out.println("Student college name is: "+clgName);
		System.out.println("Student name is:"+name);
		System.out.println("Student id is: "+id);
		
		
	}

	public static void main(String[] args) 
	{
		StudentBasicVariableScenario s1=new StudentBasicVariableScenario();
		s1.id=101;
		s1.name="Swara";
		s1.show();
		s1.marks(89);
		
		System.out.println("************************");
		StudentBasicVariableScenario s2=new StudentBasicVariableScenario();
		s2.id=102;
		s2.name="Reva";
		s2.show();
		s2.marks(99);
	}

}
