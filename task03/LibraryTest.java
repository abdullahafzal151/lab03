public class LibraryTest{

	public static void main(String[] args){
		Date d1 = new Date(01,03,2006);
		Person p1 = new Person("Abdullah", "Male", "xyz");
		Book b1 = new Book("Subtle Art", p1, d1, "Self Help");
		

		System.out.println(b1);
		
		//Checking copy constructor
		Book b2 = new Book(b1);
		
		
		System.out.println(b2);	
		
		
		//Checking if equal method is working or not
		if(b1.equals(b2)){
		
			System.out.println("=====>b1 and b2 objects are equal");
		} else{
			System.out.println("====>Objects are not equal");
		}
	
	}

}