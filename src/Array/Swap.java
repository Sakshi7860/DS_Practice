package Array;
public class Swap {

	public static void main(String args[]) {
		Animal a1 = new Animal("Lion");
		Animal a2 = new Animal("Crocodile");
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println("Before Swap:- a1:" + a1 + "; a2:" + a2);
		swap(a1, a2);
		System.out.println("After Swap:- a1:" + a1 + "; a2:" + a2);
		System.out.println("after"+a1.hashCode());
		System.out.println("after"+a2.hashCode());
	}

	public static void swap(Animal animal1, Animal animal2) {
		System.out.println(animal1.hashCode());
		System.out.println(animal2.hashCode());
		Animal temp = new Animal("");
		temp = animal1;
		animal1 = animal2;
		animal2 = temp;
		System.out.println(animal1.hashCode());
		System.out.println(animal2.hashCode());
	}

}

class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}

