/*
Create a separate class Gorilla that can throwSomething(), eatBananas(), and climb()

For the throwSomething() method, have it print out a message indicating that the gorilla has thrown something, as well as decrease the energy level by 5

For the eatBananas() method, have it print out a message indicating the gorilla's satisfaction and increase its energy by 10

For the climb() method, have it print out a message indicating the gorilla has climbed a tree and decrease its energy by 10

Create a GorillaTest class to instantiate a gorilla and have it throw three things, eat bananas twice, and climb once.
*/

public class Gorilla extends Mammal {
   
    public Gorilla(String name) {
        super(name);
    }

    public void throwSomething(String something) {
        System.out.println(String.format("%s throws the %s", this.getName(), something));
        this.changeEnergy(-5);
    }

    public void eatBananas() {
        System.out.println(String.format("%s ate a banana and is now content", this.getName()));
        this.changeEnergy(10);
    }

    public void climb() {
        System.out.println(String.format("%s climbed a tree", this.getName()));
        this.changeEnergy(-10);
    }

    public static void main(String[] args){
        Gorilla gori = new Gorilla("Gori");
        gori.throwSomething("banana");
        gori.throwSomething("apple");
        gori.throwSomething("orange");
        gori.eatBananas();
        gori.eatBananas();
        gori.climb();
        gori.displayEnergy();
    }

}