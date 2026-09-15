package Q_1_demo;

class Animal{
	public void eat() {
		System.out.println("this animal eats food");
	}
}

class Dog extends Animal{
	public void fetch() {
		System.out.println("the dog is fetching  the ball");
	}
}

class Cat extends Animal{
	public void Scratch() {
		System.out.println("the cat is scrathing the couch");
	}
}
public class Q_1_objectTypeCasting {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		Animal animal = d1;
		System.out.println("debuggijnh");
//		this is the one statement creating problem here
		Cat c1 = (Cat) animal;
		System.out.println("debuggijnh");
//		c1.Scratch();
	}
}
