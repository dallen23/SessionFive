package us.dallen23.numwrappers;
import java.util.*;

/**
 * This class takes a number from a user and determines the best data type in terms of minimal storage.
 * @author David Allen
 * @version 1.0
 */
public class Main {
    /**
     * The main driver does all the work, seeing as it is only about 35 lines
     * @param args takes String arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        String data = "";
        long num;
        double fnum;
            try {
                num = Long.parseLong(input);
                if (num < Byte.MAX_VALUE && num > Byte.MIN_VALUE) {
                    data = "Byte";
                } else if (num < Short.MAX_VALUE && num > Short.MIN_VALUE) {
                    data = "Short";
                } else if (num < Integer.MAX_VALUE && num > Integer.MIN_VALUE) {
                    data = "Integer";
                } else if (num < Long.MAX_VALUE && num > Long.MIN_VALUE) {
                    data = "Long";
                }
            } catch (Exception e) {
                try {
                    fnum = Double.parseDouble(input);
                    if (fnum < Float.MAX_VALUE && fnum > Float.MIN_VALUE) {
                        data = "Float";
                    } else if (fnum < Double.MAX_VALUE && fnum > Double.MIN_VALUE) {
                        data = "Double";
                    }
                } catch (Exception a) {
                    System.out.println("Your provided input was not in acceptable number format for standard types.");
                    return;
                }
            }
            System.out.println(data + " will be your ideal data type for this number.");
    }
}
