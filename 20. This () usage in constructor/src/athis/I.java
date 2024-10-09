package lara.athis;

public class I {
	int value = 100;

	public I() {
		H i = new H(this);
		i.display();
	}

	public static void main(String[] args) {
		I h = new I();
		System.out.println("Done");
	}
}
