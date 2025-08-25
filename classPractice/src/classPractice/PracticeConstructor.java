package classPractice;

class Book{
	String title;
	int pages;
	
	public Book() {
	}
	
	public Book(String title, int pages) {
		this.title = title;
		this.pages = pages;
	}
	
	
	
}

public class PracticeConstructor {
	public static void main(String[] args) {
		Book b1 = new Book("어린왕자", 3000);
		Book b2 = new Book();
	}
}
