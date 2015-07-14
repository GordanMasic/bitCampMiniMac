package ba.bitcamp.bookStore;

import java.util.ArrayList;

import ba.bitcamp.bookClass.Book;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Book> books = new ArrayList<Book>();

		for (int i = 0; i < 6; i++) {
			books.add(new Book());
		}

		books.set(0, new Book("The Lion, the Witch and the Wardrobe",
				"C.S. Lewis", 1950));
		books.set(1, new Book("The DaVinci code", "Dan Brown", 2003));
		books.set(2, new Book("Think and grow rich", "Napoleon Hill", 1937));
		books.set(4, new Book("The Alchemist"));
		books.set(3, new Book("Harry Potter and half/blooded prince"));
		books.add(new Book("The catcher in the rye", "J.D. Salinger", 1951));
		
		BookStore b = new BookStore(books);
		b.addBookToStore(new Book("The Alchemist"));
		System.out.println();
		System.out.println();
		b.removeBook(new Book("The Alchemist"));
		System.out.println(books.toString());
		System.out.println();
		System.out.println();
		b.removeBook(0);
		System.out.println(books.toString());
		System.out.println();
		System.out.println();
		
		
		System.out.println(b.getIndex(new Book("Harry Potter and half/blooded prince")));
		
		
		System.out.println();
		System.out.println();
		b.setBook(0, new Book("Harry Potter and half/blooded prince"));
		
		System.out.println();
		System.out.println();
		
		System.out.println(b.numOfBooks());
		
		System.out.println();
		System.out.println();
	}

}
