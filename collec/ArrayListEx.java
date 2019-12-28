package collec;

import java.util.*;


public class ArrayListEx 
{
		public static void main(String[] args)
		{
			List list=new LinkedList();
			boolean isAdded = list.add(1);
			//System.out.print("Element 1 added is" +isAdded);
			list.add(3);
			list.add(10);
			list.add(4);
			list.add(5);
			Object o=list.get(0);
			int firstElement=(int)0;
			System.out.println(firstElement);
			ArrayListEx ex=new ArrayListEx();
			System.out.print("Initial List is");
			System.out.print("\n");
			ex.print(list);
			//list.remove(1);
			Object obj=3;
			list.remove(obj);
			//list.add(2,6);
			int size=list.size();
			System.out.print("size after removal=" +size);
			System.out.print("\n");
			boolean isEmpty=list.isEmpty();
			System.out.print("" +isEmpty);
			System.out.print("\n");
			ex.print(list);
			ex.sort(list);
			System.out.print("Sorted List is"+"\n");
			ex.print(list);
			ex.printIterator(list);
		}
	
		public void sort(List list)
		{
				IntegerComparator comparator=new IntegerComparator();
				list.sort(comparator);
		}
		
		public void printIterator(List list)
		{
			Iterator it=list.iterator();
			while(it.hasNext()) 
				{
					Object o=it.next();
					int num=(int)o;
					System.out.println("By Iterator" +num);
				}
		}
		public void print(List list)
		{
			for(Object e:list)
			{
				int num=(int)e;
				System.out.println(num);
			}
		}
}

