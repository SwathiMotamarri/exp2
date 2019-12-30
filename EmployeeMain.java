package Mo;

public class EmployeeMain
{
	public static void main(String[] args)
	{
	Employee[] store=new Employee[4];
	store[0]=new Employee(1, "Ram", 2000);
	Manageremp m1=new Manageremp(2,"Sita",3000);
	store[1]=m1;
	m1.addManagedEmployee(store[0]);
	store[2]=new Employee(3, "Lakshman", 1000);
	m1.addManagedEmployee(store[2]);
	store[3]=new Employee(4, "Ravan", 4000);
	EmployeeMain m=new EmployeeMain();
	m.println(store);
	}
	public void println(Employee[] employees)
	{
	for (Employee e: employees) 
	{
		System.out.println(e.getName()+ e.getSalary());
		boolean isManageremp = e instanceof Manageremp;
		if(isManageremp)
		{
			Manageremp m=(Manageremp) e;
			System.out.println(e.getName()+ "Manages Employees as below");
			Employee[] managedemployees = m.getManagedEmployees();
			for (Employee managed : managedemployees)
			{
				if(managed!=null)
				{
					System.out.println(managed.getName()+" "+ managed.getSalary());
					
				}
			}
			System.out.println("Remaining employees are");
		}

	}
	}
	
}