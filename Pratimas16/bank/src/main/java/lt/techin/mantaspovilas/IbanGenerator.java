package lt.techin.mantaspovilas;

import java.util.Random;
/**
 * Generates a Lithuanian IBAN number, randomly.
 */
public class IbanGenerator {



    private static final String countryCode = "LT";
    private static String bankCode = "5000 5";
    private static String ibanNumber;

    /**
     *
     * @return an IBAN number
     */
    public static String generate() {
        StringBuilder sb = new StringBuilder();
        Random rnd = new Random();
        int j = 0;
        int controlDigits1 = rnd.nextInt(9);
        int controlDigits2 = rnd.nextInt(9);

        sb.append(countryCode);
        sb.append(controlDigits1);
        sb.append(controlDigits2);
        sb.append(" ");
        sb.append(bankCode);

        for (int i = 0; i < 3; i++) {
            sb.append(rnd.nextInt(9));
        }

        sb.append(" ");

        for (int i = 0; i < 8; i++) {
            if (j == 4) {
                sb.append(" ");
            }
            j++;
            sb.append(rnd.nextInt(9));
        }

        ibanNumber = sb.toString();
        return ibanNumber;
    }
}
