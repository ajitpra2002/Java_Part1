package first.part;
public class F {
	public static void main(String[] args) {
		F f1 = new F();
		System.out.println(f1);// print the memory location
		final F f2 = new F();
		System.out.println(f2);
		//f2 = f1;
		System.out.println("done");
		// can not assign the memory address to the f2
	}
}
