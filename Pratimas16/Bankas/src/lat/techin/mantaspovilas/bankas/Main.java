package lat.techin.mantaspovilas.bankas;

import java.util.ArrayList;


public class Main {
    private static DebitAccount pirmas;

    public static void main(String[] args) {
        System.out.println(IbanGenerator.generate());
        DebitAccount ac = new DebitAccount();
        AbstractAccount ad = new AbstractAccount();
        System.out.println(ac.toString());
        System.out.println(ad.toString());
        ArrayList<AbstractAccount> saskaitos = new ArrayList<>();
        Client klientas = new Client("Jonas", "fizinis");
        klientas.setAccount(new DebitAccount());
        klientas.setAccount(new DebitAccount());

        System.out.println("");
        klientas.getAccounts();
    }
}
