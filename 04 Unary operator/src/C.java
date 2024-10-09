class C {
	public static void main(String[] args) {
		int i = 0;
		// int j=i++;
		int j = i++;// j=0 ,i=1
		// first i assign the previous value (0) to the j then, i value is increased by
		// 1 and
		// using that value for printing purpose
		System.out.println("i=" + i);
		System.out.println("j=" + j);
	}
}
