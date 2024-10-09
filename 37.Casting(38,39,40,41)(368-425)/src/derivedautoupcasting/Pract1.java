package derivedautoupcasting;

public class Pract1
{
	public static void main(String[] args)
	{
		A a1 = new A();
	//B b1 = (B)a1;
		A a2 = new A();
		B b2 = (B)a2;
	}
}
