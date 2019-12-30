package Mo;

import java.util.*;

public class EmployeeMain1 
{
	public static void main(String[] args)
	{
		EmployeeMain1 m=new EmployeeMain1();
		m.execute();
	}
	Map<Integer,Employee> store=new HashMap<>();
	
	public void execute()
	{
		Employee e1=new Employee(1, "Ram", 2000);
		store.put(1,e1);
		Manageremp m1=new Manageremp(2,"Sita",3000);
		store.put(2,m1);
		m1.addManagedEmployee(e1);
		print();
		Employee fetched= findById(2);
		System.out.println(fetched.getName());
	}
	
	public Employee findById(int Id)
	{
		Employee e=store.get(Id);
		return e;
	}
		
	public void print()
	{
		Set<Integer> keys = store.keySet();
		for (Integer Id: keys) 
		{
				Employee e= store.get(Id);
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

