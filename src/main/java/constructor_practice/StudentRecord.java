package constructor_practice;

public class StudentRecord {
    private static int studentCount;
    private String name;
    private double mathScore;
    private double scienceScore;
    private double englishScore;
    private double averageStudentScore;

    public static int getStudentCount() {
        return studentCount;
    }

    public StudentRecord() {
        studentCount++;
    }
    public StudentRecord(String name) {
        this.name = name;
    }
    public StudentRecord(String name, double mathScore, double scienceScore) {
        this();
        this.name = name;
        this.mathScore = mathScore;
        this.scienceScore = scienceScore;
    }
    public StudentRecord(String name, double mathScore, double scienceScore, double englishScore) {
        this(name, mathScore, scienceScore);
        this.englishScore = englishScore;
    }
    public StudentRecord(String name, double averageStudentScore) {
        this(name);
        this.averageStudentScore = averageStudentScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getScienceScore() {
        return scienceScore;
    }

    public void setScienceScore(double scienceScore) {
        this.scienceScore = scienceScore;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
    }
    public double getAverageStudentScore() {
        return averageStudentScore = (mathScore + scienceScore + englishScore) / 3;
    }

}
