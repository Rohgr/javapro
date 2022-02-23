import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        System.out.println("welcome to leap year program");
        System.out.println("Enter a year to check a leap year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(year);
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap year");

        } else {
            System.out.println("Not a leap year");
        }
    }
}