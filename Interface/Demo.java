package syed;

final class One {
	final int a=100;
	
	final void fun()
	{
		System.out.println("Inside the parent class");
	}
}
class Two extends One
{
	void fun()
	{
		System.out.println("Inside Child class Overriden method");
	}
}

public class Demo {

	public static void main(String[] args) {
		
		Two t= new Two();
		t.fun();
	}

}
