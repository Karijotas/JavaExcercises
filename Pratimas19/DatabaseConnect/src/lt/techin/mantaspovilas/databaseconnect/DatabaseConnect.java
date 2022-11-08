package lt.techin.mantaspovilas.databaseconnect;

import java.sql.*;

public class DatabaseConnect {
    Connection cn;
    Statement st;

    public static final DatabaseConnect DATABASE_CONNECT = new DatabaseConnect();
    private static boolean initialised = false;

    private DatabaseConnect() {

    }

    public void start(){
        System.out.println("Trying to connect...");
        connect();
    }

    private void connect() {
        try{
            Class.forName("org.h2.Driver");
            cn = DriverManager.getConnection("jdbc:h2:~/test");
            st = cn.createStatement();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DatabaseConnect getInstance(){
        if (initialised){
            return DATABASE_CONNECT;
        } else {
            DATABASE_CONNECT.start();
            initialised = true;
            return DATABASE_CONNECT;
        }
    }

}
