package MyPackage;

class Employee2
{
	String Name;
	int Age;
	int Id;
	String Department;
	int Salary;
	Employee2(String Name)
	{
		this.Name = Name;
	}
	Employee2(String Name,int Age)
	{
		this(Name);
		this.Age = Age;
	}
	Employee2(String Name,int Age,int Id)
	{
		this(Name,Age);
		this.Id = Id;
	}
	Employee2(String Name,int Age,int Id,String Department)
	{
		this(Name,Age,Id);
		this.Department = Department;
	}
	Employee2(String Name,int Age,int Id,String Department,int Salary)
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
public class demo3
{
	public static void main(String[] args) 
	{
		Employee E1[] = new Employee[10];
		E1[0] = new Employee("ABC",21,1171,"CSE",1000);
		E1[1] = new Employee("DEF",22,1172,"CSE",2000);
		E1[2] = new Employee("GHI",23,1173,"CSE",3000);
		E1[3] = new Employee("JKL",24,1174,"CSE",4000);
		E1[4] = new Employee("MNO",25,1175,"CSE",5000);
		E1[5] = new Employee("PQR",26,1176,"CSE",6000);
		E1[6] = new Employee("STU",27,1177,"CSE",7000);
		E1[7] = new Employee("VWX",28,1178,"CSE",8000);
		E1[8] = new Employee("YZA",29,1179,"CSE",9000);
		E1[9] = new Employee("BCD",30,1180,"CSE",10000);
		int MaxSalary = 0;
		int MaxIndex = 0;
		for(int i=0;i<10;++i)
		{
			if(E1[i].Salary > MaxSalary)
			{
				MaxSalary = E1[i].Salary;
				MaxIndex = i;
			}
		}
		E1[MaxIndex].Display();
	}
}
