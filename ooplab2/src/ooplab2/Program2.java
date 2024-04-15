package ooplab2;



class dog{
	public String name;
	public String breed;
	
	public dog(String name, String breed) {
		this.name=name;
		this.breed=breed;
	}
}
public class Program2 {

	public static void main(String[] args) {
		dog dog1 = new dog("Buddy", "Golden Retriever");
        dog dog2 = new dog("Charlie", "Bulldog");
        
        System.out.println("before: ");
        System.out.println("Name of dog1 is "+dog1.name + " and breed is "+dog1.breed);
        System.out.println("Name of dog2 is "+dog2.name + " and breed is "+dog2.breed);
        
        dog1.name="Rocky";
        dog2.breed="pitbull";
        
        System.out.println("After: ");
        System.out.println("Name of dog1 is "+dog1.name + " and breed is "+dog1.breed);
        System.out.println("Name of dog2 is "+dog2.name + " and breed is "+dog2.breed);
        
	}

}

