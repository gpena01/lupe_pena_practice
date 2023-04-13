package polymorphism_and_inheritance;

// create a subclass FireMonster to inherit from super class Monster
public class FireMonster extends Monster {
    public FireMonster(String name) {
        super(name);
    }

    // @Override attack() method from super class Monster
    @Override
    public String attack() {
        return "Attack with fire!";
    }
}
