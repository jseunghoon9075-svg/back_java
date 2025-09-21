package book;

import java.util.ArrayList;

public class BookController implements BookManager{
	
	public ArrayList<Book> list = new ArrayList<>();

	@Override
	public void addBook(Book nBook) {
		list.add(nBook);
	}

	@Override
	public ArrayList<Book> getAllBook() {
		return list;
	}

	@Override
	public Book searchBookBybNo(String bNo) {
		
		Book b = null;
		
		for(Book a: list) {
			if(a.getbNo().equals(bNo)) {
				b = a;
			}
		}
		
		return b;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		ArrayList<Book> TitleList = new ArrayList<Book>();
		
		for(Book a: list) {
			if(a.getTitle().contains(title)) {
				TitleList.add(a);
			}
		}
		return TitleList;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		for(Book a: list) {
			if(a instanceof Magazine == false) {
				bookList.add(a);
			}
		}
		return bookList;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		ArrayList<Book> magazineList = new ArrayList<Book>();
		
		for(Book a: list) {
			if(a instanceof Magazine) {
				magazineList.add(a);
			}
		}
		return magazineList;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		ArrayList<Book> yearList = new ArrayList<>();
		
		for(Book a: list) {
			if(((Magazine)(a)).getYear() == year) {
				yearList.add(a);
			}
		}
		return yearList;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		ArrayList<Book> publishList = new ArrayList<>();
		
		for(Book a: list) {
			if(a.getPublisher().contains(publisher)) {
				publishList.add(a);
			}
		}
		return publishList;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		ArrayList<Book> priceList = new ArrayList<>();
		
		for(Book a: list) {
			if(a.getPrice() < price) {
				priceList.add(a);
			}
		}
		return priceList;
	}

	@Override
	public int getTotalPrice() {
		int sum = 0;
		
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i).getPrice();
		}
		return sum;
	}

	@Override
	public int getAvgPrice() {
		return getTotalPrice() / list.size();
	}
	
	
}
