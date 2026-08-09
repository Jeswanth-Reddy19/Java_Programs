package observation;
import java.util.Scanner;
class Animal{
	void stay() {
		System.out.println("animals do live outside");
	}
	void food() {
		System.out.println("animmals eat food");
	}
	void sound() {
		System.out.println("animals do sounds");
	}
}
class Cow extends Animal{
	void stay(){System.out.println("cows live in the farm");
	}
	void food() {
		System.out.println("cows eat grass");
	}
	void sound() {
		System.out.println("cows do a sounds like Mooo...");
	}
}
class Pig extends Animal{
	void stay(){System.out.println("pigs live in the bushes");
	}
	void food() {
		System.out.println("pigs eat  fruits,vegitables");
	}
	void sound() {
		System.out.println("pigs do a sounds like oink...");
	}
}
class Horse extends Animal{
	void stay(){System.out.println("horse live in the horsefarm");
	}
	void food() {
		System.out.println("horse eat grass,hay");
	}
	void sound() {
		System.out.println("horse do a sounds called whinny...");
	}
}
public class AnimalFarm {
public static void main(String[] args) {
	Cow c=new Cow();
	Pig p=new Pig();
	Horse h=new Horse();
	System.out.println("the cow,pig,horse details are shown below");
	c.stay();
	c.food();
	c.sound();
	p.stay();
	p.food();
	p.sound();
	h.stay();
	h.food();
	h.sound();
	
}
}
