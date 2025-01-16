//This code is of parameterized constructor
class Human {

	String name;
	int age;
	double weight;
	// Creating constructor
	Human(String name,int age,double weight){
		
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void eat() {
		System.out.println(name+" is eating");
	}
	void drink() {
		System.out.println(name+" is drinking *burp*");
	}
	
	public class Main{

		public static void main(String[] args) {
			
			Human human1 = new Human("Rick",65,70);
			Human human2 = new Human("Morty",16,50);
				
			human1.drink();
			human2.eat();
			
		}
	}
	
		
}