package lt.techin.mantaspovilas.generator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Generator {

    public static final Generator GENERATOR = new Generator();
    public static boolean initialised = false;

    private Generator(){}

    public void start(){
        System.out.println("Starting Generator");
    }

    public void generate(int from, int untill){
        List<Integer> newset = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 1; i<=untill; i++){
            newset.add(i);
        }
        Collections.shuffle(newset);

        System.out.println(newset);
        System.out.println("Numbers generated!");
    }

    public static Generator getInstance(){
        if (initialised){
            return GENERATOR;
        } else {
            GENERATOR.start();
            initialised = true;
            return GENERATOR;
        }
    }
}
