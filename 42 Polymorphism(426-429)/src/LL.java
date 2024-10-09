
public class LL {
	public static void main(String[] args)
	{    
		shape r=new square();
		 r.draw();
	}
}




class shape{
    void draw()
	 {
	 System.out.println(" not any shape ");
	 }
}
class square extends shape
{
    void draw()
	 {
	 System.out.println("square ");
	 }
}
 