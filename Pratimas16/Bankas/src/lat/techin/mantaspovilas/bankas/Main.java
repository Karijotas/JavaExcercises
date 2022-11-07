package lat.techin.mantaspovilas.bankas;

import java.util.ArrayList;


public class Main {
    private static DebitAccount pirmas;

    public static void main(String[] args) {


        Client klientas = new Client("Jonas", "fizinis");
        klientas.setAccount(new DebitAccount());
        klientas.setAccount(new DebitAccount());
        klientas.getAccounts();
        klientas.setAccount(new CreditAccount(100));

        System.out.println("");

        klientas.getAccounts();
    }
}
