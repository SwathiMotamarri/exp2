package Mo;
import java.util.*;

import exceptions.IncorrectIdException;

public class EmployeeMain2
{

		public static void main(String[] args)
		{
			EmployeeMain2 m=new EmployeeMain2();
			m.execute();
		}
		Map<Integer,Employee> store=new HashMap<>();
		
		public void execute()
		{
			try{
				Employee e1=new Employee(-3, "Ram", 2000);
				//store.put(1,e1);
				addEmployee(e1);
				Manageremp m1=new Manageremp(2,"Sita",3000);
				//store.put(2,m1);
				addEmployee(m1);
				m1.addManagedEmployee(e1);
				print();
				Employee fetched= findById(2);
				System.out.println(fetched.getName());
				}catch (IncorrectIdException e)
				{
					System.out.println("Incorrect ID");
				}
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
		
		public void addEmployee(Employee e)
		{
			int id=e.getId();
			if(id<0)
			{
				throw new IncorrectIdException("Id is negative");
			}
			store.put(id, e);
		}
	}


