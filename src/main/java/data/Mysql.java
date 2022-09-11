package data;

import java.sql.Connection;
import java.sql.DriverManager;

public class Mysql {

    public Connection connection;

    public Mysql() {
    }

    public Connection getConnection() {

        String databaseName="ejemplo";
        String databaseUser="root";
        String databasePassword="root";
        String url="jdbc:mysql://localhost/"+databaseName;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection(url,databaseUser,databasePassword);
            System.out.println("connection Succesful");
        }catch (Exception e) {
            e.printStackTrace();
            e.getCause();
            System.out.println("se fue a la mrd todo");
        }
        return connection;
    }
}
