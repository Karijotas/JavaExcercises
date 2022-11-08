package lt.techin.mantaspovilas.databaseconnect;

public class TaskManager {

    public static void main(String[] args) {
        DatabaseConnect db = DatabaseConnect.getInstance();

        db.start();
    }
}
