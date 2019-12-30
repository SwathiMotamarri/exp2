package Mo;

import java.util.Map;

public class Student 
{
	public Student(int Id)
	{
		this.Id=Id;
	}
	private int Id;
	
	public int getId()
	{
		return Id;
	}
Student s1=new Student(2);
Student s2=new Student(4);
	
@Override
	public boolean equals(Object obj)
	{
	if(obj==this)
	return true;
	if(obj==null|| !(obj instanceof Student))
	return false;
	Student e=(Student)obj;
	return e.Id==this.Id;
	}

@Override
	public int Object.hashCode()
	{
	 	if(s1.hashCode() == s2.hashCode()) 
	 	{ 
 		if(s1.equals(s2)) 
	 			{
	 			System.out.println("Both Objects are equal. "); 
	 			return 1;
	 			}
	 		else
	 			{
	 			System.out.println("Both Objects are not equal. "); 
	 			return 0;
	 			}
	 	} 
	 	else
	 		{
	 		System.out.println("Both Objects are not equal. ");  
	 		return 0;
	 		}
	}  

public void printbyEntries(Map<Integer,Student>map)
		{
			Set<Map.Entry<Integer,Student>>entriees= map.entrySet();
			for(Map.Entry<Integer,Student>entry:entriees)
			{
				int key=entry.getKey();
				Student value=entry.getValue();
				System.out.print(value.getId());
			}
		}
public void printBy
}
