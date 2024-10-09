
interface client
{
	void input();
	void output();
}
class Ajit implements client //ajit is developer 
{
	String name;
	double salary;
	//void input()
	public void input()
	{
		Scanner r=new Scanner(System.in);
		System.out.println("please enter name::");
		name=r.nextline();//nextline method is inside the scanner method it takes string.
		System.out.println("please  salary::");
		name=r.nextdouble();//nextdouble method is inside the scanner method it takes string.
	}
	public void output()
	{
		System.out.println(name  +"" + salary);
	}
	public static void main(String [] args)
	{
	client c=new Ajit();
	c.input();
	c.output();
	}
 }