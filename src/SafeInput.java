
import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }


public static int getInt(Scanner pipe, String prompt) {
    while (true) {
        System.out.print(prompt + ": ");

        if (pipe.hasNextInt()) {
            int value = pipe.nextInt();
            pipe.nextLine();
            return value;
        }
        System.out.println("Invalid input: put an integer.");
        pipe.nextLine();
    }
}

public static double getDouble(Scanner pipe, String prompt) {
    while (true) {
        System.out.print(prompt + ": ");
        if (pipe.hasNextDouble()) {
            double value = pipe.nextDouble();
            pipe.nextLine();
            if (!Double.isNaN(value) && !Double.isInfinite(value)) {
                return value;
            }
        } else {
            pipe.nextLine();
        }
        System.out.println("Invalid input: enter a decimal number.");
    }
}
public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
    if (low > high) {
        throw new IllegalArgumentException("low must not be bigger than  high");
    }

    while (true) {
        System.out.print(prompt + " [" + low + " - " + high + "]: ");

        if (pipe.hasNextInt()) {
            int value = pipe.nextInt();
            pipe.nextLine();

            if (value >= low && value <= high) {
                return value;
            }

            System.out.println("Out of range. Try again.");
        } else {
            pipe.nextLine();
            System.out.println("Invalid input: put an integer.");
        }
    }
}
public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
    if (low > high) {
        throw new IllegalArgumentException("low must not be bigger than high");
    }

    while (true) {
        System.out.print(prompt + " [" + low + " - " + high + "]: ");

        if (pipe.hasNextDouble()) {
            double value = pipe.nextDouble();
            pipe.nextLine();

            if (value >= low && value <= high) {
                return value;
            }

            System.out.println("Out of range. Try again.");
        } else {
            pipe.nextLine();
            System.out.println("Invalid input: enter a number.");
        }
    }
}

public static boolean getYNConfirm(Scanner pipe, String prompt) {
    while (true) {
        System.out.print(prompt + " [Y/N]: ");
        String answer = pipe.nextLine().trim();

        if (answer.equalsIgnoreCase("Y")) {
            return true;
        }

        if (answer.equalsIgnoreCase("N")) {
            return false;
        }

        System.out.println("Please enter Y or N.");
    }
}
public static String getRegExString(Scanner pipe, String prompt, String regEx) {
    while (true) {
        System.out.print(prompt + ": ");
        String response = pipe.nextLine();

        if (response.matches(regEx)) {
            return response;
        }

        System.out.println("Input does not match the required format. Try again.");
    }
}

public static void prettyHeader(String msg) {
    final int width = 60;
    final int insideone = width - 6;

    if (msg.length() > insideone) {
        throw new IllegalArgumentException("Header message must be at most 54 characters");
    }

    for (int i = 0; i < width; i++) {
        System.out.print("*");
    }
    System.out.println();

    int extra = insideone - msg.length();
    int leftSpaces = extra / 2;
    int rightSpaces = extra - leftSpaces;

    System.out.print("***");

    for (int i = 0; i < leftSpaces; i++) {
        System.out.print(" ");
    }

    System.out.print(msg);

    for (int i = 0; i < rightSpaces; i++) {
        System.out.print(" ");
    }

    System.out.println("***");

    for (int i = 0; i < width; i++) {
        System.out.print("*");
    }
    System.out.println();
}

}
