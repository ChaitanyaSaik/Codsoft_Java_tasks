import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        int no_of_subjects;
        System.out.print("Enter no of subjects: ");
        no_of_subjects = myscan.nextInt();
        float subject_marks[] = new float[no_of_subjects];
        for (int i = 0; i < no_of_subjects; i++) {
            System.out.print("\nenter the marks for subject" + (i + 1) + ":");
            subject_marks[i] = myscan.nextFloat();
        }
        System.out.print("\nTotal Score of the all subjects:");
        float total_score = 0;
        for (int i = 0; i < no_of_subjects; i++) {
            total_score += subject_marks[i];
        }
        System.out.print(total_score);
        System.out.print("\nthe Average of the all subjects:");
        float average = 0;
        average = total_score / no_of_subjects;
        System.out.print(average);
        System.out.print("\nThe Grades of the subjects\n");
        for (int i = 0; i < no_of_subjects; i++) {
            if (subject_marks[i] >= 90 && subject_marks[i] < 100) {
                System.out.println("Grade of the subject " + (i + 1) + " is : O");
            } else if (subject_marks[i] >= 80 && subject_marks[i] < 90) {
                System.out.println("Grade of the subject " + (i + 1) + " is : A");
            } else if (subject_marks[i] >= 70 && subject_marks[i] < 80) {
                System.out.println("Grade of the subject " + (i + 1) + " is : B");
            } else if (subject_marks[i] >= 60 && subject_marks[i] < 70) {
                System.out.println("Grade of the subject " + (i + 1) + " is : D");
            } else if (subject_marks[i] >= 50 && subject_marks[i] < 60) {
                System.out.println("Grade of the subject " + (i + 1) + " is : C");
            } else if (subject_marks[i] >= 30 && subject_marks[i] < 50) {
                System.out.println("Grade of the subject " + (i + 1) + " is : P");
            } else if (subject_marks[i] < 30) {
                System.out.println("you have failed the subject, Better luck next");
            } else {
                System.out.println();
            }
        }

    }
}