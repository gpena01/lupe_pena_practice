package polymorphism_and_inheritance;

// create a subclass StoneMonster to inherit from super class Monster
public class StoneMonster extends Monster {
    public StoneMonster(String name) {
        super(name);
    }

    // @Override attack() method from super class Monster
    @Override
    public String attack() {
        return "Attack with stones!";
    }
}
