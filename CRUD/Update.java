package CRUD;

import java.sql.*;

public class Update {
    public static void updateByAadharNo(Connection con, String[] args) {
        try {
            String query = "update data set Age = Age + ? where Aadhar_No = ? ";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, Integer.parseInt(args[3]));
            preparedStmt.setString(2, args[2]);
            int rs = preparedStmt.executeUpdate();
            if (rs == 0) {
                System.out.println(" Number " + args[2] + " not present in data");
            } else {

                System.out.println("Updated");
            }
        } catch (Exception e) {
            System.out.println("Please Check Help Command \n type \"-h\"");
            System.out.println(e);
        }

    }

    public static void updateByFirstDose(Connection con, String[] args) {
        try {
            String query = "update data set Dose_No = 'Second' where Dose_No = 'First' and Aadhar_No = ? ";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, args[2]);
            int rs = preparedStmt.executeUpdate();
            if (rs == 0) {
                System.out.println("Update failed!!!");
            } else {

                System.out.println("Updated");
            }
        } catch (Exception e) {
            System.out.println("Please Check Help Command \n type \"-h\"");

        }

    }

    public static void updateBySecondDose(Connection con, String[] args) {
        try {
            String query = "update data set Dose_No = 'Vaccinated' where Dose_No = 'Second' and Aadhar_No = ? ";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, args[2]);
            int rs = preparedStmt.executeUpdate();
            if (rs == 0) {
                System.out.println("Update failed!!!");
            } else {

                System.out.println("Updated");
            }
        } catch (Exception e) {
            System.out.println("Please Check Help Command \n type \"-h\"");

        }

    }

    

    public static void updateAll(Connection con, String[] args) {
        try {
            String query = "update data set Age = Age + ? ";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, Integer.parseInt(args[2]));
            int rs = preparedStmt.executeUpdate();
            if (rs == 0) {
                System.out.println("Update failed!!!");
            } else {

                System.out.println("Updated");
            }
        } catch (Exception e) {
            System.out.println("Please Check Help Command \n type \"-h\"");

        }

    }

}