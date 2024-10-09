package lara.com;

public class T {
	int i;

	T() {
		System.out.println("t()");
		i = 10;
	}

	T(int i) {
		this();
		System.out.println("f(int)");
	}

	public static void main(String[] args) {
		T t1 = new T();
		System.out.println("...........");
		T t2 = new T(20);
		System.out.println(t1.i + " ," + t2.i);

	}

}
