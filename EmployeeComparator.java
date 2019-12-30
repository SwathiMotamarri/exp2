package Mo;
import java.util.Comparator;

public class EmployeeComparator 
{
public class EmployeeComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2)
	{
	if(o1.getId>o2.getId())
		return 1;
	if(o2.getId>o1.getId())
		return -1;
	return 0;
	}
}
}
