package CRUD;

import java.sql.*;
import java.util.ArrayList;

public class Display {
  private static ArrayList<DisplayStuff> CovidLists = new ArrayList<>();
  public static void displayAll(Connection con) {
    try {
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("select * from data");

      
      while(rs.next())
      {
        DisplayStuff d1=new DisplayStuff(rs.getString(1), rs.getString(2), rs.getString(3),
              rs.getString(4), rs.getInt(5));
              CovidLists.add(d1);
      }
      if(CovidLists.size()==0)
      {
        System.out.println("No records");

      }
      else
      {
        for(int i=0;i<CovidLists.size();i++)
        {
          System.out.printf("%-15s%-35s%-25s%-25s%-15s\n", CovidLists.get(i).getAadhar_No(), CovidLists.get(i).getCandidate_Name(), CovidLists.get(i).getCategory(),
              CovidLists.get(i).getDose_No(), CovidLists.get(i).getAge());
        }
      }

    } catch (Exception e) {
      System.out.println("Please Check Help Command \n type \"-h\"");
    }

  }

  public static void displayCatagories(Connection con, String category) {
    try {
      String query = "select * from data where Category = ? ";
      PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, category);
      ResultSet rs = preparedStmt.executeQuery();

      while(rs.next())
      {
        DisplayStuff d1=new DisplayStuff(rs.getString(1), rs.getString(2), rs.getString(3),
              rs.getString(4), rs.getInt(5));
              CovidLists.add(d1);
      }
      if(CovidLists.size()==0)
      {
        System.out.println("No records");

      }
      else
      {
        for(int i=0;i<CovidLists.size();i++)
        {
          System.out.printf("%-15s%-35s%-25s%-25s%-15s\n", CovidLists.get(i).getAadhar_No(), CovidLists.get(i).getCandidate_Name(), CovidLists.get(i).getCategory(),
              CovidLists.get(i).getDose_No(), CovidLists.get(i).getAge());
        }
      }

    } catch (Exception e) {
      System.out.println("Please Check Help Command \n type \"-h\"");

    }

  }

  public static void displayDoseNum(Connection con, String dosenum) {
    try {
      String query = "select * from data where Dose_No= ? ";
      PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, dosenum);
      ResultSet rs = preparedStmt.executeQuery();

      while(rs.next())
      {
        DisplayStuff d1=new DisplayStuff(rs.getString(1), rs.getString(2), rs.getString(3),
              rs.getString(4), rs.getInt(5));
              CovidLists.add(d1);
      }
      if(CovidLists.size()==0)
      {
        System.out.println("No records");

      }
      else
      {
        for(int i=0;i<CovidLists.size();i++)
        {
          System.out.printf("%-15s%-35s%-25s%-25s%-15s\n", CovidLists.get(i).getAadhar_No(), CovidLists.get(i).getCandidate_Name(), CovidLists.get(i).getCategory(),
              CovidLists.get(i).getDose_No(), CovidLists.get(i).getAge());
        }
      }

    } catch (Exception e) {
      System.out.println("Please Check Help Command \n type \"-h\"");

    }

  }

  public static void displayCandidateName(Connection con, String cname) {
    try {
      String query = "select * from data where Candidate_Name= ? ";
      PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, cname);
      ResultSet rs = preparedStmt.executeQuery();

      while(rs.next())
      {
        DisplayStuff d1=new DisplayStuff(rs.getString(1), rs.getString(2), rs.getString(3),
              rs.getString(4), rs.getInt(5));
              CovidLists.add(d1);
      }
      if(CovidLists.size()==0)
      {
        System.out.println("No records");

      }
      else
      {
        for(int i=0;i<CovidLists.size();i++)
        {
          System.out.printf("%-15s%-35s%-25s%-25s%-15s\n", CovidLists.get(i).getAadhar_No(), CovidLists.get(i).getCandidate_Name(), CovidLists.get(i).getCategory(),
              CovidLists.get(i).getDose_No(), CovidLists.get(i).getAge());
        }
      }

    } catch (Exception e) {
      System.out.println("Please Check Help Command \n type \"-h\"");

    }

  }

  public static void displayAdNo(Connection con, String Adno) {
    try {
      String query = "select * from data where Aadhar_No= ? ";
      PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, Adno);
      ResultSet rs = preparedStmt.executeQuery();

      while(rs.next())
      {
        DisplayStuff d1=new DisplayStuff(rs.getString(1), rs.getString(2), rs.getString(3),
              rs.getString(4), rs.getInt(5));
              CovidLists.add(d1);
      }
      if(CovidLists.size()==0)
      {
        System.out.println("No records");

      }
      else
      {
        for(int i=0;i<CovidLists.size();i++)
        {
          System.out.printf("%-15s%-35s%-25s%-25s%-15s\n", CovidLists.get(i).getAadhar_No(), CovidLists.get(i).getCandidate_Name(), CovidLists.get(i).getCategory(),
              CovidLists.get(i).getDose_No(), CovidLists.get(i).getAge());
        }
      }

    } catch (Exception e) {
      System.out.println("Please Check Help Command \n type \"-h\"");

    }

  }

  public static void displayAge(Connection con, int Age) {
    try {
      String query = "select * from data where Age= ? ";
      PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setInt(1, Age);
      ResultSet rs = preparedStmt.executeQuery();

      while(rs.next())
      {
        DisplayStuff d1=new DisplayStuff(rs.getString(1), rs.getString(2), rs.getString(3),
              rs.getString(4), rs.getInt(5));
              CovidLists.add(d1);
      }
      if(CovidLists.size()==0)
      {
        System.out.println("No records");

      }
      else
      {
        for(int i=0;i<CovidLists.size();i++)
        {
          System.out.printf("%-15s%-35s%-25s%-25s%-15s\n", CovidLists.get(i).getAadhar_No(), CovidLists.get(i).getCandidate_Name(), CovidLists.get(i).getCategory(),
              CovidLists.get(i).getDose_No(), CovidLists.get(i).getAge());
        }
      }

    } catch (Exception e) {
      System.out.println("Please Check Help Command \n type \"-h\"");

    }

  }

}