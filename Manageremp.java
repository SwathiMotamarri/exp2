package Mo;

public class Manageremp extends Employee
{
	private int i=0;
	private Employee ManagedEmployees[]=new Employee[2];
	public Employee[] getManagedEmployees() 
	{ 
		return ManagedEmployees;
	}
		
	public Manageremp(int Id, String name, double salary) 
	{
		super(Id, name, salary);
	}

	public void addManagedEmployee(Employee e)
	{
		ManagedEmployees[i]=e;
		i++;
	}
}
