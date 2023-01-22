package load;

import java.io.*;
import java.sql.*;

public class LoadData {
    public static void loadData(Connection con) {

        String line = "";
        String splitBy = ",";
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.csv"));
            Statement stmt2 = con.createStatement();
            String sql = "CREATE TABLE data(Aadhar_No varchar(20) NOT NULL,CANDIDATE_NAME varchar(40),CATEGORY varchar(20),DOSE_NO varchar(20),AGE INT,PRIMARY KEY(Aadhar_No))";
            
            String sql2 = "drop table if exists data";
            stmt2.executeUpdate(sql2);
            stmt2.executeUpdate(sql);
            
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] emp = line.split(splitBy);

                String query = " insert into data values (?, ?, ?, ?, ?)";                 PreparedStatement preparedStmt = con.prepareStatement(query);
                preparedStmt.setString(1, emp[0]);
                preparedStmt.setString(2, emp[1]);
                preparedStmt.setString(3, emp[2]);
                preparedStmt.setString(4, emp[3]);
                preparedStmt.setInt(5, Integer.parseInt(emp[4]));

                preparedStmt.execute();
            }
            System.out.println("table formed");
            br.close();
        } catch (Exception e) {

            System.out.println("File could not load");
            System.out.println(e);

        }
    }
}
