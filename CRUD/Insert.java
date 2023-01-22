package CRUD;

import java.sql.*;

public class Insert {
    public static void insertRecord(Connection con, String[] args) {
        try {
            String query = " insert into data values (?,?, ?, ?, ?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);

            preparedStmt.setString(1, args[1]);
            preparedStmt.setString(2, args[2]);
            preparedStmt.setString(3, args[3]);
            preparedStmt.setString(4, args[4]);
            preparedStmt.setInt(5, Integer.parseInt(args[5]));
            preparedStmt.execute();
            System.out.println("Inserted successfully");
        } catch (Exception e) {
            System.out.println("Wrong command\nType \"-h\" to get help");

        }

    }
}
