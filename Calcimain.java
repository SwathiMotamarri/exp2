package Mo;

import java.util.Scanner;

public class Calcimain 
{
	public static void main(String[] args)
	{
	
	Calci c=new Calci();
	int intResult=Calci.add(100,20);
	System.out.println(intResult);
	float floatResult=Calci.add(10.51f, 2.2f);
	System.out.println(floatResult);
	String stringResult=Calci.add("Swathi ","Motamarri");
	System.out.println(stringResult);
	
	}
}
