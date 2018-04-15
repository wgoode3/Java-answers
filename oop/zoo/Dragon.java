/*
Create a Dragon class that can fly(), eatHumans(), and attackTown() and has a default energy level of 300.

For the fly() method, print the sound a dragon taking off and decrease its energy by 50.

For the eatHumans() method, print the so- well, never mind, just increase its energy by 25.

For the attackTown() method, print the sound of a town on fire and decrease its energy by 100.

Create a DragonTest class to instantiate a dragon and have it attack three towns, eat two humans, and fly twice.
*/

// dragon inheriting from mammal... why just why?
public class Dragon extends Mammal {
    private static int dragonCount = 0;
    
    public Dragon(String name) {
        super(name);
        this.changeEnergy(200);
        this.dragonCount++;
    }

    public void fly() {
        System.out.println(String.format("WOOOOSH!!!\n%s takes flight!", this.getName()));
        this.changeEnergy(-50);
    }

    public void eatHumans() {
        System.out.println(String.format("CRUNCH!!!\n%s eats the weak, pathetic humans!", this.getName()));
        this.changeEnergy(25);
    }

    public void attackTown() {
        System.out.println(String.format("GAAAOOOO!!!~\n%s attacks the town!", this.getName()));
        this.changeEnergy(-100);
    }

    public static void main(String[] args) {
        Dragon tohru = new Dragon("Tohru");
        tohru.attackTown();
        tohru.attackTown();
        tohru.attackTown();
        tohru.eatHumans();
        tohru.eatHumans();
        tohru.fly();
        tohru.fly();
        tohru.displayEnergy();
        System.out.println(String.format("There are %d dragons", Dragon.dragonCount));
        Dragon kanna = new Dragon("Kanna");
        System.out.println(String.format("There are %d dragons", Dragon.dragonCount));
    }

}