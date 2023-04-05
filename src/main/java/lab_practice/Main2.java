package lab_practice;

public class Main2 {
    public static void main(String[] args) {
        StudentRecord student1 = new StudentRecord("Keertika", 95, 96, 98);
        student1.getAverageStudentScore();

        StudentRecord student2 = new StudentRecord("Vanessa", 97, 95, 99);
        student2.getAverageStudentScore();

        StudentRecord student3 = new StudentRecord("Lupe", 85, 95, 90);
        student3.getAverageStudentScore();

        StudentRecord student4 = new StudentRecord("Lily", 99, 95, 95);
        student4.getAverageStudentScore();

        int totalNumOfStudents = StudentRecord.getStudentCount();

        System.out.println("Total number of students: " + totalNumOfStudents);
        System.out.println();
        System.out.println("name: " + student1.getName() + "\n" + String.format("average score: %,.1f", student1.getAverageStudentScore()));
        System.out.println();
        System.out.println("name: " + student2.getName() + "\n" + String.format("average score: %,.1f", student2.getAverageStudentScore()));
        System.out.println();
        System.out.println("name: " + student3.getName() + "\n" + String.format("average score: %,.1f", student3.getAverageStudentScore()));
        System.out.println();
        System.out.println("name: " + student4.getName() + "\n" + String.format("average score: %,.1f", student4.getAverageStudentScore()));
//        System.out.println(String.format("%,.1f", student1.getAverageScorePerStudent()));
    }
}
