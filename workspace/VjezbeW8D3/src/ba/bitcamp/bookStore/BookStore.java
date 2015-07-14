package ba.bitcamp.bookStore;

import java.util.ArrayList;

import ba.bitcamp.bookClass.Book;

public class BookStore {

	private ArrayList<Book> books = new ArrayList<Book>();

	/*
	 * Constructors
	 */
	public BookStore(ArrayList<Book> books) {
		this.books = books;
	}

	public BookStore() {
		this(new Book());
	}

	public BookStore(Book... books) {
		for (int i = 0; i < books.length; i++) {
			this.addBookToStore(books[i]);
		}
	}

	/**
	 * Adding book to store
	 * 
	 * @param b
	 */
	public void addBookToStore(Book b) {
		int counter = 0;
		for (int i = 0; i < books.size(); i++) {
			if (b.equals(books.get(i))) {
				counter++;
			}
		}
		if (counter > 0) {
			System.out.println("That book is already in store!");
		} else {
			books.add(b);
		}
	}

	/**
	 * Remove book by index
	 * 
	 * @param num
	 */
	public void removeBook(int num) {
		try {
			books.remove(num);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Wrong inputed index!");
		}
	}

	/**
	 * Remove book by element
	 * 
	 * @param b
	 */
	public void removeBook(Book b) {
		for (int i = 0; i < books.size(); i++) {
			if (b.equals(books.get(i))) {
				books.remove(i);
			}
		}
	}

	/**
	 * Find index of book in list
	 * 
	 * @param b
	 * @return
	 */
	public int getIndex(Book b) {
		for (int i = 0; i < books.size(); i++) {
			if (b.equals(books.get(i))) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Set book on certain index. Works if there is no same book in list.
	 * 
	 * @param num
	 * @param b
	 */
	public void setBook(int num, Book b) {
		int counter = 0;
		for (int i = 0; i < books.size(); i++) {
			if (b.equals(books.get(i))) {
				counter++;
			}
		}
		if (counter > 0) {
			System.out.println("That book is already in store!");
		} else {
			books.set(num, b);
		}
	}
	
	public int numOfBooks(){
		return books.size();
	}
}
