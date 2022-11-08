package lt.techin.mantaspovilas.printspooler;

public class TaskManager {

    public static void main(String[] args) {
        System.out.println(PrintSpooler.getPrintSpooler().toString());
        System.out.println(PrintSpooler.getPrintSpooler().toString());
        System.out.println();
        System.out.println();
        PrintSpooler.getPrintSpooler().print("tekstas spausdinimui");
    }

}