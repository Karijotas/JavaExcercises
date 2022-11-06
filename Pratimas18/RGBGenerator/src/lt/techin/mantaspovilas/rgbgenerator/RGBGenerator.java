package lt.techin.mantaspovilas.rgbgenerator;

import java.util.ArrayList;
import java.util.Random;

public class RGBGenerator {


    public static String randomGenerate() {
        StringBuilder sb = new StringBuilder();
        Random rnd = new Random();
        sb.append("rgb ");
        sb.append("(");
        sb.append(rnd.nextInt(255));
        sb.append(", ");
        sb.append(rnd.nextInt(255));
        sb.append(", ");
        sb.append(rnd.nextInt(255));
        sb.append(")");
        return sb.toString();
    }

    public static ArrayList<String> randomGenerateArray(int size) {
        ArrayList<String> colours = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            colours.add(RGBGenerator.randomGenerate());
        }
        return colours;
    }
}
