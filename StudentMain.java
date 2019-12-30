package Mo;

import java.util.*;

public class StudentMain 
{
	public static void main(String[] args)
		{
				StudentMain m=new StudentMain();
				m.execute();
		}
	Map<Integer,Student> store=new HashMap<>();
	
	public void execute()
	{
		Student s1=new Student(1);
		store.put(1,s1);
		Student s2=new Student(2);
		store.put(2,s2);
		
		Student fetched= findById(2);
		System.out.println(fetched.getId());
	}
	
	public Student findById(int Id)
	{
		Student s=store.get(Id);
		return s;
	}
}
