package Mo;
import java.util.*;

public class SetEx 
{
	public static void main(String[] args)
		{
			Employee e1=new Employee(1,"Swathi",2000);
			Employee e2=new Employee(2,"Sailaja",3000);
			//boolean same=e1==e2;
			//System.out.println("e1 and e2 same=" +same);
			//boolean equals=e1.equals(e2);
			//System.out.println("e1 equalse2=" +equals);
			Employee e3=new Employee(3,"Sekhar",4000);
			Employee e4=new Employee(4,"Prasad",5000);
			Set<Employee> set=new LinkedHashSet<>();
			set.add(e1);
			set.add(e2);
			set.add(e3);
			set.add(e4);
			int size=set.size();
			System.out.println("size=" +size);
			boolean contains=set.contains(e2);
			System.out.println("Set contains e2 " +contains);
			
			Comparator<Employee> comparator=new EmployeeComparator();
			Set<Employee> set=new TreeSet<>(comparator);
			
			SetEx ex=new SetEx();
			//System.out.print("Set after new ex creation\n");
			ex.print(set);
			//boolean removed=set.remove(e2);
			//System.out.print("Removed entry " +removed);
			//System.out.print("\n");
			//System.out.print("Set after removal\n");
			//ex.print(set);
		}
	public void print(Set<Employee> set)
	{
		for(Object o:set)
		{
			Employee e=(Employee)o;
			System.out.println(e.getId()+ ""+e.getName());
		}
	}
}

