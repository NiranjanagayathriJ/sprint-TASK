package compare;

import java.util.*;

public class LibraryManagementSystem {

	public static void main(String[] args) throws InvalidBookException {
		Library lib=new Library();
		Book b1=new Book(1,"To kill a Mockingbird","Harper Lee","Fiction",3);
		Book b2=new Book(2,"The palace of Illusions","Chitra D.","Fiction",5);
		lib.addBook(b1);
		lib.addBook(b2);
		
		Member m1=new Member("id12","Niranjana","123456789");
		Member m2=new Member("id34","Gayathri","2234155467");
		lib.addMember(m1);
		lib.addMember(m2);
		
		System.out.println("Books in the library:");
		lib.displayBooks();
		System.out.println("\nMembers of the library:");
		lib.displayMembers();
		
		m1.borrowBook(b1);
		m2.borrowBook(b1);
		System.out.println("\nNow available books after borrowing:");
		lib.displayBooks();
		
		m1.returnBook(b1);
		m2.borrowBook(b1);
		m2.borrowBook(b1);
		m2.borrowBook(b1);
		m2.borrowBook(b1);
		System.out.println("\nNow available books after returning:");
		lib.displayBooks();
		
		m1.returnBook(b1);
		m1.returnBook(b1);
		Book searchBookAuthor=lib.searchBookByAuthor("Chitra D.");
		System.out.println("\nSearched Book:"+searchBookAuthor);
		
		Book searchBookTitle=lib.searchBookByTitle("To kill a Mockingbird");
		System.out.println("\nSearched Book:"+searchBookTitle);
		
		Member searchMemName=lib.searchMemberByName("Gayathri");
		System.out.println("\nSearched Member:"+searchMemName);
		
		Member searchMemPh=lib.searchMemberByPhone("123456789");
		System.out.println("\nSearched Member:"+searchMemPh);
	}

}

class Book{
	private int bookId;
	private String title;
	private String author;
	private String genre;
	private int quantityAvailable;
	
	public Book(int bookId,String title,String author,String genre,int quantityAvailable) {
		this.author=author;
		this.bookId=bookId;
		this.genre=genre;
		this.title=title;
		this.quantityAvailable=quantityAvailable;
		
	}
	public int getbookId() {
		return bookId;
	}
	public void setbookId(int bookId){
		this.bookId=bookId;
	}
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title=title;
	}
	public String getgenre() {
		return genre;
	}
	public void setgenre(String genre) {
		this.genre=genre;
	}
	public String getauthor() {
		return author;
	}
	public void setauthor(String author) {
		this.author=author;
	}
	public int quantityAvailable() {
		return quantityAvailable;
	}
	public void setquantityAvailable(int quantityAvailable) {
		this.quantityAvailable=quantityAvailable;
	}
	
	public void borrowBook() {
		if(quantityAvailable>0)
			quantityAvailable--;
		else
			System.out.println("No Book Available");
	}
	public void returnBook() {
		quantityAvailable++;
	}
	public String toString() {
		return "Title:"+title+" Author:"+author+" Book ID:"+bookId+" Genre:"+genre+" Quantity Available:"+quantityAvailable;
		
	}
	public boolean equals(Object o) {
		Book b=(Book)o;
		if(this.bookId==bookId)
			return true;
		else
			return false;
	}

}

class Member{
    private String memberId;
    private String name;
    private String phoneNumber;
    private List<Book>booksBorrowed;
    
    public Member(String memberId,String name,String phoneNumber) {
    	this.memberId=memberId;
    	this.booksBorrowed=new LinkedList<>();
    	this.name=name;
    	this.phoneNumber=phoneNumber;
    }
	public String getmemberId() {
		return memberId;
	}
	public void setmemberId(String memberId) {
		this.memberId=memberId;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getphoneNumber() {
		return phoneNumber;
	}
	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	/*public Book getbooksBorrowed() {
		return (Book) booksBorrowed;
	}
	public void setbooksBorrowed(Book booksBrrowed) {
		this.booksBorrowed=booksBorrowed;
	}*/
	
	public void borrowBook(Book book) {
		try {
		if(book.quantityAvailable()>0) {
			book.borrowBook();
			booksBorrowed.add(book);
		}else {
			throw new InvalidBookException("Invalid");
		}
		//System.out.println("No. of Books Borrowed:"+borrowedBook);
	}catch(InvalidBookException e) {
		System.out.println("\nNo copies available");
	}
	}
	public void returnBook(Book book) {
		try {
		if(booksBorrowed.remove(book)) {
		 book.returnBook();
		}else {
			throw new InvalidReturnException("Not Borrowed");
		}
	}catch(InvalidReturnException e) {
		System.out.println("\nBook is NOT Borrowed by you");
	}
	}
	
	public String toString() {
		return "Name:"+name+" Member ID:"+memberId+" Phone:"+phoneNumber+" Books borrowed:"+booksBorrowed;
	}
	public boolean equals(Object o) {
		Book b=(Book)o;
		if(this.memberId==memberId)
			return true;
		else
			return false;
	}
}

class Library{
	private List<Book>books;
	private List<Member>members;
	
	public Library() {
		this.books=new LinkedList<>();
		this.members=new LinkedList<>();
	}
	public void addBook(Book book) {
		books.add(book);
	}
	public void addMember(Member member) {
		members.add(member);
	}
	public void displayBooks() {
		for(Book book:books) {
			System.out.println(book);
		}
	}
	public void displayMembers() {
		for(Member member:members){
			System.out.println(member);
		}
	}
	public Book searchBookByTitle(String tite) {
		for(Book book:books) {
			if(book.gettitle().equalsIgnoreCase(tite)) {
				return book;
			}
		}
		return null;
		
	}
	public Book searchBookByAuthor(String author) {
		for(Book book:books) {
			if(book.getauthor().equalsIgnoreCase(author)) {
				return book;
			}
		}
		return null;
		
	}
public Member searchMemberByName(String name) {
	for(Member member:members) {
		if(member.getname().equalsIgnoreCase(name)) {
			return member;
		}
	}
	return null;
        
    }
 
    public Member searchMemberByPhone(String phoneNumber) {
    	for(Member member:members) {
    		if(member.getphoneNumber().equals(phoneNumber)) {
    			return member;
    		}
    	}
		return null;
        
    }
 
    public void borrowBook(Member member, Book book) throws InvalidBookException  {
       if(book.quantityAvailable()>0) {
		  book.borrowBook();
	   }else {
		   throw new InvalidBookException("Book NOT available");
	   }
    }
    public void returnBook(Member member, Book book)throws InvalidReturnException{
    	book.returnBook();
    }
}

class InvalidBookException extends Exception{
	public InvalidBookException(String msg) {
		super(msg);
	}
}
class InvalidReturnException extends Exception{
	public InvalidReturnException(String msg) {
		super(msg);
	}
}
