package count;

import java.sql.*;

public class CountBySecondDose extends Count {
    public void count(Connection con) {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt
                    .executeQuery("select count(*) from data group by Dose_No having Dose_No ='Second' ");
            if (rs.next() == false) {
                System.out.println("No Result");
            } else {

                do {
                    System.out.println(rs.getString(1) + " Second Dose Vaccinated");
                } while (rs.next());
            }

        } catch (Exception e) {
            System.out.println("Please Check Help Command \n type \"-h\"");

        }

    }
}
