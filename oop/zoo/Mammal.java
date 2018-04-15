/* 
Create a Mammal class that has an energyLevel and displayEnergy() method. The displayEnergy() method should show the animal's energy level as well as return it.
*/

public class Mammal {
    private int energyLevel = 100;
    private String name = null;

    public Mammal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int displayEnergy() {
        System.out.println(String.format("%s has %d energy", this.name, this.energyLevel));
        return this.energyLevel;
    }

    public void changeEnergy(int amount) {
        this.energyLevel += amount;
    }

    public static void main(String[] args) {
        Mammal gerald = new Mammal("Gerald");
        gerald.displayEnergy();
    }
}
