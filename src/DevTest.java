import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test each method here:
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        int age = SafeInput.getInt(in, "Enter your age");
        double salary = SafeInput.getDouble(in, "Enter your hourly wage");
        int month = SafeInput.getRangedInt(in, "Enter a month number", 1, 12);
        double score = SafeInput.getRangedDouble(in, "Enter a score", 0.0, 100.0);
        boolean confirm = SafeInput.getYNConfirm(in, "Do you want to continue?");
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");

        System.out.println("\nCollected values:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Wage: " + salary);
        System.out.println("Month: " + month);
        System.out.println("Score: " + score);
        System.out.println("Continue: " + confirm);
        System.out.println("SSN: " + ssn);

        SafeInput.prettyHeader("Lab 08 - Get Methodical Complete!");
    }
}
