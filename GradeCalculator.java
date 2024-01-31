import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter marks obtained in each subject (out of 100):");
        int numSubjects = 0;
        int totalMarks = 0;

        while (true) {
            System.out.print("Subject " + (numSubjects + 1) + ": ");
            int marks = scanner.nextInt();


            if (marks < 0 || marks > 100) {
                System.out.println("Invalid input! Marks should be between 0 and 100.");
                continue;
            }

            totalMarks += marks;
            numSubjects++;

            System.out.print("Do you want to enter marks for another subject? (yes/no): ");
            String anotherSubject = scanner.next().toLowerCase();

            if (!anotherSubject.equals("yes")) {
                break;
            }
        }


        System.out.println("\nTotal Marks: " + totalMarks);


        double averagePercentage = (double) totalMarks / numSubjects;
        System.out.println("Average Percentage: " + averagePercentage + "%");


        char grade = calculateGrade(averagePercentage);

        System.out.println("Grade: " + grade);

        scanner.close();
    }


    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
