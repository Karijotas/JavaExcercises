package lat.techin.mantaspovilas.bankas;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Client {
    private String name;
    private String type;


    private ArrayList<AbstractAccount> accounts = new ArrayList<>();

    public Client(String name, String type) {
        this.name = name;
        this.type = type;

    }

    public void setAccount(AbstractAccount account){
        accounts.add(account);
    }

    public void getAccounts(){
        for (AbstractAccount account : accounts){
            System.out.println(account);
        }
    }
}
