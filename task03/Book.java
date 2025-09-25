public class Book{


	private String bookid;
	private String title;
	private Person author;
	private Date publicationDate;
	private String genre;
	private static int counter = 101;
	
	
	public Book(){
	
	}
	
	public Book(String bookid,String title, Person author, Date publicationDate, String genre){
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.publicationDate = publicationDate;
		this.genre = genre;
		
	
	}
	public Book(String title, Person author, Date publicationDate, String genre){
		bookid = String.format("LB25-BK-%03d", counter++);
		this.title = title;
		this.author = author;
		this.publicationDate = publicationDate;
		this.genre = genre;
		
	}
	//Copy constructor of book
	public Book(Book b){
		this.bookid = b.bookid;
		this.title = b.title;
		this.author = new Person(b.author);
		this.publicationDate = new Date(b.publicationDate);
		this.genre = b.genre;	
	}
	
	String getTitle(){
		return title;
	}
	@Override
	public String toString() {
    		return String.format("Book ID: %s\tTitle: %s\tAuthor: %s\tPublication Date: %s\tGenre: %s",
                         bookid, title, author, publicationDate, genre);
	}
	
	@Override
	public boolean equals(Object o){
		Book b1 = (Book)o;
		return this.title.equals(b1.title) && this.author.getName().equals(b1.author.getName()) && this.publicationDate.getYear() == b1.publicationDate.getYear();
			}
		

}