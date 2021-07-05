package converter;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        appInit();
    }

    private static void appInit() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter two numbers in format: {source base} {target base} (To quit type /exit) ");
            String sourceBase = scanner.next();
            if (sourceBase.equals("/exit")) {
                break;
            }
            String targetBase = scanner.next();
            while (true) {
                System.out.print("Enter number in base " + sourceBase + " to convert to base " + targetBase + " (To go back type /back) ");
                String numberBase = scanner.next();
                if (numberBase.equals("/back")) {
                    System.out.println();
                    break;
                }
                BigInteger toDecimal = new BigInteger(numberBase, Integer.parseInt(sourceBase));
                String toTarget = toDecimal.toString(Integer.parseInt(targetBase));

                System.out.println("Conversion result: " + toTarget + "\n");
            }
        }
    }
}
