package collec;

import java.util.*;

public class IntegerComparator implements Comparator 
{
	@Override
	public int compare(Object o1, Object o2)
	{
		int num1=(int)o1;
		int num2=(int)o2;
		if(num1>num2)
			return 1;
		if(num1<num2)
			return -1;
		return 0;
	}
}
