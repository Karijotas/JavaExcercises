package lt.techin.mantaspovilas.printspooler;

import java.util.List;

public class PrintSpooler {

    private static PrintSpooler printSpooler;

    private PrintSpooler(){}

    public static synchronized PrintSpooler getPrintSpooler(){
        if (printSpooler == null){
            printSpooler = new PrintSpooler();

        }
        System.out.println("Spausdinti pasiruošes");
        return printSpooler;
    }

    public void print(String string){
        System.out.println("Printing: "+ string);
    }

    public void print(List<String> stringList){
        System.out.println("Printing: ");
        System.out.println(stringList);
    }
}