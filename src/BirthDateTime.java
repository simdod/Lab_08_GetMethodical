import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);
        int day = 0;

        switch (month)
        {
            case 2:  // February
                day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 29);
                break;
            case 4: case 6: case 9: case 11: // 30-day months
                day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 30);
                break;
            default: // 31-day months
                day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);
        }

        int hour = SafeInput.getRangedInt(in, "Enter hour of birth (1–24)", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter minute of birth (1–59)", 1, 59);

        System.out.printf("\nYou were born on %02d/%02d/%d at %02d:%02d\n", month, day, year, hour, minute);
    }
}
