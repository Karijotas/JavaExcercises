package lt.techin.mantaspovilas.moneybox;

public class MoneyBox {

    private double balance = 0.0;
    private int counter = 0;
    private double totalDepositSum = 0.0;

    public void addMoney(double money) {
        if (balance + money <= 1000 && money>0) {
            this.balance += money;
            this.totalDepositSum += money;
            counter++;
        } else {
            System.out.println("Box is full or ...!");
        }
    }

    {
        if(balance == 0.0){
            System.out.println("MoneyBox is empty!");
        }
    }

    public void removeMoney(double money){
        if (money > balance || money <= 0){
            System.out.println("Wrong!");
        } else {
            balance -= money;
        }
    }

    public double calculateAverageDeposit(){
        if (counter == 0){
            return 0.0;
        } else {
            return totalDepositSum / counter;
        }
    }

    public double getBalance() {
        if (balance == 0.0){
            System.out.println("The box is empty!");
        }
        return balance;
    }
}
