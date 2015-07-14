package ba.bitcamp.bookClass;

public class Book {

	private String nameOfBook;
	private String nameOfAuthor;
	private int yearOfPublishing;

	public Book(String nameOfBook, String nameOfAuthor, int yearOfPublishing) {
		this.nameOfBook = nameOfBook;
		this.nameOfAuthor = nameOfAuthor;
		this.yearOfPublishing = yearOfPublishing;
	}

	public Book(String nameOfBook) {
		this(nameOfBook, "UNKNOWN", 0);
	}

	public Book() {
		this("UNKNOWN", "UNKNOWN", 0);
	}

	public String getNameOfBook() {
		return nameOfBook;
	}

	public String getNameOfAuthor() {
		return nameOfAuthor;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setNameOfBook(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}

	public void setNameOfAuthor(String nameOfAuthor) {
		this.nameOfAuthor = nameOfAuthor;
	}

	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}

	public String toString() {
		return String.format(
				"Book name: %s\nAuthor: %s\nYear of publishing: %d\n",
				nameOfBook, nameOfAuthor, yearOfPublishing);
	}

	public boolean equals(Book other) {
		if (this.nameOfBook.equals(other.nameOfBook)
				&& this.nameOfAuthor.equals(other.nameOfAuthor)
				&& this.yearOfPublishing == other.yearOfPublishing) {
			return true;
		} else {
			return false;
		}
	}

}
