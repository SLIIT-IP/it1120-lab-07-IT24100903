import java.util.Scanner;

public class IT24100903Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Student " + i);
            System.out.print("Enter marks for four subjects: ");
            
            // Taking input for four subjects in a single line
            int[] marks = new int[4];
            marks[0] = input.nextInt();
            marks[1] = input.nextInt();
            marks[2] = input.nextInt();
            marks[3] = input.nextInt();
            
            // Calculating sum and average
            int sum = marks[0] + marks[1] + marks[2] + marks[3];
            double avg = sum / 4.0;

            // Determining the grade
            String grade;
            if (avg > 75) {
                grade = "Distinction";
            } else if (avg > 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            // Output the results
            System.out.println("Average is : " + avg);
            System.out.println("Overall Grade is : " + grade);
            System.out.println();  // Blank line between students
        }

        input.close();
    }
}
