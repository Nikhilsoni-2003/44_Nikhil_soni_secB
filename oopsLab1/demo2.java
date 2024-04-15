package MyPackage;

class Employee
{
	String Name;
	int Age;
	int Id;
	String Department;
	int Salary;
	Employee(String Name)
	{
		this.Name = Name;
	}
	Employee(String Name,int Age)
	{
		this(Name);
		this.Age = Age;
	}
	Employee(String Name,int Age,int Id)
	{
		this(Name,Age);
		this.Id = Id;
	}
	Employee(String Name,int Age,int Id,String Department)
	{
		this(Name,Age,Id);
		this.Department = Department;
	}
	Employee(String Name,int Age,int Id,String Department,int Salary)
	{
		this(Name,Age,Id,Department);
		this.Salary = Salary;
	}
	void Display()
	{
		System.out.println(Name);
		System.out.println(Age);
		System.out.println(Id);
		System.out.println(Department);
		System.out.println(Salary);
	}
}
public class demo2 
{
	public static void main(String[] args) 
	{
		Employee E1 = new Employee("Nikhil",20,1108,"CSE",99000);
		E1.Display();
	}
}
