
class person{
	public String name;
	public int age;
	
	public person(String name, int age) {
		this.name=name;
		this.age=age;
	}
}

public class program1 {
	public static void main(String[] args) {
		person person1 = new person("Nikhil",20);
		person person2 = new person("Ram",25);
		
		System.out.println("Name of person1 is : "+person1.name+" and Age of person1 is : "+person1.age);
		System.out.println("Name of person1 is : "+person2.name);
		System.out.println("Age of person2 is : "+person2.age);
	}
}
