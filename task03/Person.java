public class Person{

	private String name;
	private String gender;
	private String address;
	
	public Person(String name, String gender, String address){
	
		this.name = name;
		this.gender = gender;
		this.address = address;
	}
	
	//copy constructor of person
	public Person(Person p){
		this.name = p.name;
		this.gender = p.gender;
		this.address = p.address;
	}
	
	void setName(String name){
		this.name = name;
	}
	void setGender(String gender){
		this.gender = gender;
	}
	void setAddress(String address){
		this.address = address;
	}
	String getName(){
		return name;
	}
	String getGender(){
		return gender;
	}
	String getAddress(){
		return address;
	}
	
	@Override
	public String toString(){
		return String.format("%s\t%s\t%s\t", name, gender, address);
	}
	
	@Override
	public boolean equals(Object o){
		Person p = (Person)o;
		return p.getName().equals(this.name);
	}







}