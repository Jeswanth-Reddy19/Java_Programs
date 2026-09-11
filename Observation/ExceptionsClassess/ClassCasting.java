package exceptionhandling;

class Animal{
	
}
class Dog extends Animal{
	void display() {
		System.out.println("it is Dog object");
	}
}
class Cat extends Animal{
	void display() {
		System.out.println("it is Cat object");
	}
}
public class ClassCasting {
public static void main(String[] args) {
	try{
		Animal a=new Dog();
	Dog d=(Dog) a;
	Cat c=(Cat) a;
	}
	catch(ClassCastException cc){
		System.out.println("the class casting involved is invalid");
	}
	
}
}
