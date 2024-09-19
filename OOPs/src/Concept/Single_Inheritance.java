package Concept;
class a
{
	public void add()
	{
		System.out.println("Addition");
	}
}
class b extends a
{
	public void sub()
	{
		System.out.println("Subtract");
	}
}

public class Single_Inheritance 
{
	public static void main(String arg[])
	{
		b obj = new b();
		obj.sub();
		obj.add();
	}

}
