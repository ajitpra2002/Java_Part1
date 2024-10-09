package iib;

public class G {
	{
		System.out.println("IIB");
	}

	G() {
		this(90);
		System.out.println("g()");
	}

	G(int i) {
		System.out.println("g(int)");
	}

	public static void main(String[] args) {
		G g1 = new G();
		System.out.println("......");
		G g2 = new G(20);
		System.out.println("....");
	}
}
