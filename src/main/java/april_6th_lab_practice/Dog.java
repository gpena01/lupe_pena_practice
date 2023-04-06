package april_6th_lab_practice;

public class Dog {
    // Declare bark and run fields
    private String bark;
    private String run = "run";

    // set setters and getters
    public void getBark() { System.out.println(bark); }
    public void setBark(String bark) {
        this.bark = bark;
    }

    public String getRun() { return "run"; }

    public void setRun(String run) { this.run = run; }
}
