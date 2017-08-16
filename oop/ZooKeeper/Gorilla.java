public class Gorilla extends Mammal {
	public Gorilla(String name, int energy){
		super(name, energy);
	}
	public Gorilla throwSomething(){
		this.energy -= 5;
		System.out.println("The Gorilla has thrown something!");
		return this;
	}
	public Gorilla eatBananas(){
		this.energy += 10;
		System.out.println("The Gorilla ate bananas and is now happy!");
		return this;
	}
	public Gorilla climb(){
		this.energy -= 10;
		System.out.println("The Gorilla climbed a tree!");
		return this;
	}
}