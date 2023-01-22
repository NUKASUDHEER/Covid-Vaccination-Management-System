package CRUD;
import java.sql.*;

public class Delete {
    public static void deleteRecord(Connection con, String[] args) {
        try {
            String query = "delete from data where Aadhar_No=?";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, args[1]);
            int rs=preparedStmt.executeUpdate();
            if(rs==0)
            {
                System.out.println(" Aadhar number "+args[1]+" not present in data");
            }
            else
            {
                System.out.println("Deleted");

            }
        } catch (Exception e) {
            System.out.println("Wrong command\nType \"-h\" to get help");

        }

    }
}