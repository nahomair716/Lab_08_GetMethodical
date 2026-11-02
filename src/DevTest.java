import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("TEST A: nonempty string");
        String name = SafeInput.getNonZeroLenString(in, "Enter a name");
        System.out.println("Accepted: " + name);


        System.out.println("TEST B: integer");
        int number = SafeInput.getInt(in, "Enter any integer");
        System.out.println("Accepted: " + number);


        System.out.println("TEST C: double");
        double decimal = SafeInput.getDouble(in, "Enter any decimal");
        System.out.println("Accepted: " + decimal);


        System.out.println("TEST D: ranged integer");
        int rangedNumber = SafeInput.getRangedInt(in, "Choose a number", 1, 10);
        System.out.println("Accepted: " + rangedNumber);


        System.out.println("TEST E: ranged double");
        double rangedDecimal = SafeInput.getRangedDouble(in, "Choose a price", 0.5, 10.0);
        System.out.println("Accepted: " + rangedDecimal);


        System.out.println("TEST F: yes/no");
        boolean yes = SafeInput.getYNConfirm(in, "Continue?");
        System.out.println("Accepted: " + yes);



        System.out.println("TEST G: regex");
        String code = SafeInput.getRegExString(in, "Enter three uppercase letters", "[A-Z]{3}");
        System.out.println("Accepted: " + code);
    }
}
