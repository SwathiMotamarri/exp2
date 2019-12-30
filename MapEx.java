package Mo;

import java.util.*;

public class MapEx
{
	public static void main(String[] args)
	{
		Map<Integer,Employee> map=new TreeMap<>(new EmployeeKeyComparator());
		//Map<Integer,Employee>map=new HashMap<>();
		Employee e1=new Employee(1,"Chandu",200);
		Employee e2=new Employee(2,"Chan", 300);
		Employee e3=new Employee(3,"Cha", 400);
		map.put(1, e1);
		map.put(2, e2);
		map.put(3,e3);
		//Employee fetched1=map.get(1);
		//Employee fetched2=map.get(2);
		MapEx ex=new MapEx();
		ex.printByKeys(map);
		System.out.print("By Values\n");
		ex.printByValues(map);
		System.out.print("By Entries\n");
		ex.printbyEntries(map);
		
		//int a=compare(1,2);
		//map.remove(1);
		//System.out.print("After Removing entry\n");
		//ex.printByKeys(map);
	}	
	
	public void printbyEntries(Map<Integer,Employee>map)
	{
		Set<Map.Entry<Integer,Employee>>entriees= map.entrySet();
		for(Map.Entry<Integer,Employee>entry:entriees)
		{
			int key=entry.getKey();
			Employee value=entry.getValue();
			System.out.println(value.getName());
		}
	}

	public void printByValues(Map<Integer,Employee>map)
	{
		Collection<Employee>values=map.values();
		for(Employee e:values)
		System.out.println(e.getName());
	}
	public void printByKeys(Map<Integer,Employee>map)
	{
		Set<Integer> keys=map.keySet();
		for(int key:keys) 
		{
			Employee value= map.get(key);
			System.out.println(value.getName());
		}
	}
}
