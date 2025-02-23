package program;

import java.util.ArrayList;
import java.util.List;

class Book{
	int bookId;
	String bookName;
	String author;
	double price;
	String publisher;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Book() {
		super();
	}
	public Book(int bookId, String bookName, String author, int price, String publisher) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price
				+ ", publisher=" + publisher + "]";
	}
}

class BookStore{
	List<Book> books=new ArrayList<Book>();
	public void addBook(Book book) {
		books.add(book);
	}
	
	public List<Book> getBookInfoByName(String name) throws BookNotFoundException{
		List<Book> list=books.stream().filter(b->b.getBookName().equals(name)).toList();
		if(list.size()==0) {
			throw new BookNotFoundException("The book "+name+" is not available");
		}else
			return books.stream().filter(b->b.getBookName().equals(name)).toList();
	}
	
	public void deleteBookByNameAndAuthor(String name,String author) {
		Book book =books.stream().filter(b->b.getBookName().equals(name) && b.getAuthor()
				.equals(author)).findFirst().get();
		books.remove(book);
	}
	
	public void updateBookPrice(double price,String name) {
		for(Book book:books) {
			if(book.getBookName().equals(name)) {
				book.setPrice(price);
			}
		}
	}
}

class BookNotFoundException extends Exception{
	String message;
	public BookNotFoundException(String message) {
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
}
public class BookClient {
	public static void main(String[] args) {
		Book book =new Book(100,"Immortals of Meluha","Amish",500,"Bell Publishers");
		Book book1=new Book(101,"it happens","he",520,"Bell Publishers");
		
		BookStore himalayBookstore=new BookStore();
		himalayBookstore.addBook(book);
		BookStore vishalandra=new BookStore();
		vishalandra.addBook(book);;
		vishalandra.addBook(book1);
		
		try {
			System.out.println(vishalandra.getBookInfoByName("Immortals of Meluha"));
		}catch(BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(vishalandra.getBookInfoByName("it happens"));
		}catch(BookNotFoundException e) {
			e.printStackTrace();
		}
	}
}
