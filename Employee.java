package Mo;

public class Employee 
{

public Employee(int Id,String name,double salary)
{
	this.Id=Id;
	this.name=name;
	this.salary=salary;
}
	private int Id;
	
	public int getId()
	{
		return Id;
	}
	public void setId(int Id)
	{
		this.Id= Id;
	}
	private String name;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	private double salary;
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	
	@Override
	public boolean equals(Object obj)
	
	{
		//col.Employee e1=new col.Employee(10);
		//col.Employee e2=e1;
		//boolean result=e1.equals(e2)
		//
		if(obj==this)
		{
			return true;
		}
		//col.Employee e1=new col.Employee(10);
		//col.Employee e2=null;
		//boolean result=e1.equals(e2);
		//
		//col.Employee e1=new col.Employee(10);
		//String e2="10";
		//boolean result=e1.equals(e2);
		if(obj==null|| !(obj instanceof Employee))
		{
			return false;
		}
		//col.Employee e1=new col.Employee(10);
		//col.Employee e2=new col.Employee(10);
		//boolean result=e1.equals(e2);
	
		Employee e=(Employee)obj;
		return e.Id==this.Id;
	}
		
}

