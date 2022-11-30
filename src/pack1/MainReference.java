package pack1;

public class MainReference 
{
	public static void main(String[] args)
	{
		//Lambda Expression
		MyInterface mi = () -> new Demo1();
		mi.m1();
		
		//Constructor Reference
		MyInterface mi2 = Demo1::new;
		mi2.m1();
		
		
	}

}
