package polymorphism_and_inheritance;

// create a superclass called Monster
public class Monster {
    // create a variable
    private String name;

    // create a constructor
    public Monster(String name) {
        this.name = name;
    }

    // define a method named attack()
    public String attack() {
        return "";
    }

    // generate setter and getter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
