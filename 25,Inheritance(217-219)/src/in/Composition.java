package in;

import java.util.ArrayList;
import java.util.List;

public class Composition {
	public static void main(String[] args) {

		// Creating the Objects of Book class.
		Book b1 = new Book("Java", "Jamesh Gosline");
		Book b2 = new Book("Thinking in Java", "Bruce Eckel");
		Book b3 = new Book("Java:The Complete Reference", "Herbert Schildt");

		// Creating the list which contains the
		// no. of books.
		List<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);

		Library library = new Library(books);

		List<Book> bks = library.getTotalBooksInLibrary();
		for (Book bk : bks) {

			System.out.println(
			"Title : " + bk.title + " and " + " Author : " + bk.author);
		}
	}
}

/*

In above example a library can have no. of books on same or different subjects. 
So, If Library gets destroyed then All books within that particular 
	library will be destroyed. i.e. book can not exist without library. 

That’s why it is composition.

*/
