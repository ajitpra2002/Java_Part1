package first.part;

class Y {
	final int i;

	Y() {
		i = 10;//i is only intilise in the constructor only 
	}

	 Y(int j){
		 
		i=j;
	 }
	 public static void main(String[] args) {
		Y y = new Y();
		//y.i=20;//here we are reinitilise the i
		
	}
	
}
