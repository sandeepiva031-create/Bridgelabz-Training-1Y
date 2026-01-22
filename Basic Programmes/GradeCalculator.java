import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for Physics, Chemistry and Maths:");
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();

        int total = physics + chemistry + maths;
        double percentage = (total / 300.0) * 100;

        System.out.println("Percentage: " + percentage);

        if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70 && percentage < 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 60 && percentage < 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 50 && percentage < 60) {
            System.out.println("Grade: D");
        } else if (percentage > 40 && percentage < 50) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: R");
        }
    }
}
