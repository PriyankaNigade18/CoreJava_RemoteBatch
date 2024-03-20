package oop.Encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args)
	{
		EmployeeDetails emp=new EmployeeDetails();
		emp.show();
				
		//The field EmployeeDetails.id is not visible
//		emp.id=201;
//		emp.name="Amit";
		//private data we can access using setter and getter methods		
		emp.setId(301);
		emp.setName("Abhi");
		System.out.println(emp.getId());
		emp.show();

	}

}
