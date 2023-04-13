package polymorphism_and_inheritance;

// create a subclass WaterMonster to inherit from super class Monster
public class WaterMonster extends Monster {
    public WaterMonster(String name) {
        super(name);
    }

    // @Override attack() method from super class Monster
    @Override
    public String attack() {
        return "Attack with water!";
    }
}
