abstract class Animal{
	
	    String colour,breed,name;
		abstract void eat();
		void speak() {
			System.out.println("Speak");
		}
		}
class Dog extends Animal{
	public void eat() {
		System.out.println("Dog eats");
	}
	public void speak() {
		System.out.println("Dog barks");
		
	}
	public void print(String name,String breed,String colour){
		
		this.colour=colour;
		this.breed = breed;
		this.name = name;
		System.out.println("colour " +colour);
		System.out.println("Breed " +breed);
		System.out.println("Name " +name);
	}
}
public class Ques2{
	public static void main(String[] args){
		
		Animal obj = new Dog();
		Dog obj1 = new Dog();
		obj.eat();
		obj.speak();
		obj1.eat();
		obj1.speak();
		obj1.print("Rocky","lebra","Golden");
		
		
		
	}
}