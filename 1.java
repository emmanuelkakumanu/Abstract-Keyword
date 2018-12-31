import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
abstract class Abs_Demo
{
	abstract void method1();
	void method2()
	{
		System.out.println("non Abstract method");
	}
}
class Ideone extends Abs_Demo
{
	void method1()
	{
		System.out.println("abstract method");
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Ideone obj=new Ideone();
		obj.method1();
		obj.method2();
		
	}
}
