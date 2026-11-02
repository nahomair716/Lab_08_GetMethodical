import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        String studentId = SafeInput.getRegExString(in, "Enter UC  M number", "^[Mm]\\d{5}$");
        String menuChoice = SafeInput.getRegExString(in, "Choose Open, Save, View, Quit (O/S/V/Q)", "^[OoSsVvQq]$");

        System.out.println("\nSSN accepted: " + ssn);
        System.out.println("Student ID accepted: " + studentId);
        System.out.println("Menu choice accepted: " + menuChoice);
    }
}