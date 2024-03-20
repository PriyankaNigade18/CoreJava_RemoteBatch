package oop.Encapsulation;

public class EmployeeDetails 
{	//data hiding
	private int id=101;
	private String name="Pooja";
	
	//Methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Business logic
	public void show()
	{
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args)
	{

		EmployeeDetails emp1=new EmployeeDetails();
		emp1.show();

	}

}
