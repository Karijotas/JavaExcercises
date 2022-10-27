package lt.techin.mantaspovilas.moneybox;

public class Main {
    public static void main(String[] args) {
        MoneyBox box = new MoneyBox();
        box.addMoney(36.6);
        System.out.println(box.getBalance());
        box.removeMoney(13);
        box.addMoney(314);
        box.addMoney(54);
        box.removeMoney(4);
        System.out.println(box.getBalance());
        System.out.println(box.calculateAverageDeposit());
    }

}


