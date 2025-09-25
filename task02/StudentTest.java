public class StudentTest{

	public static void main(String[] args){
	
		Student s1 = new Student("Maaz Bhai", "Male", "17-05-2004", "xyz");
		Student s2 = new Student("Ubaid Bhai", "Male", "20-04-1980", "abc");
		Student s3 = new Student("Matti Bhai", "Female", "31-12-1897", "Kuch Bhi");
		
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		Student s4 = new Student(s1);
		
		System.out.println(s4.toString());
		
		
		if(s4.equals(s1)){
			System.out.println("======>Object s4 and s1 names are equal");
		}
		
		
		
		
		
	}
}