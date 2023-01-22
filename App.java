import java.sql.*;
import CRUD.*;
import connection.*;
import load.*;
import count.*;


public class App {

    public static Connection con = null;

    public static void printHelp() {
        System.out.println("Help for commands:");
        String[] commands = { "-h", "-l", "-s all", "-s cat \"Category\"", "-s adno \"Aadhar_No\"", "-s cname \"Candidate_Name\"", 
                 "-i", "-count cat \"Category\"", "-count firstdose ", "-count seconddose ",
                 "-u adno \"Aadhar_No\"", "-u all", "-u fdose \"FirstDose\"", "-u sdose \"SecondDose\"", "-d", "-v"};
        String[] description = { "Help for commands", "Load data.csv in MySql", "Display whole data",
                "Display data records for particular category", "Display data records for particular Aadhar No",
                "Display data records for particular Candidate Name", "Insert data into the records", "Count the number of data records per category",
                "Count the number of data records for first dose ", "Count the number of data records for second dose ", "Update the data records by Aadhar No",
                "Update all the data records", "Update the data records by first dose", "Update the data records by second dose", 
                "Delete the data records by Aadhar No", "Version"
                 };
        String[] attributes = { "Aadhar_No", "Candidate_Name", "Category", "Dose_No", "Age" };
        String[] attributes_datatype = { "String", "String", "String", "String", "Integer" };

        for (int i = 0; i < commands.length; i++) {
            System.out.printf("%-50s%s\n", commands[i], description[i]);

        }
        System.out.println("\n\nData Type:");
        for (int i = 0; i < attributes_datatype.length; i++) {
            System.out.printf("%-20s%s\n", attributes[i], attributes_datatype[i]);
        }

    }

    public static void version() {
        System.out.println("Version \"1.0.0\"");
        System.out.println("Used for the project ->");
        System.out.println("java version \"16.0.2\"");
        System.out.println("mysql-connector-java \"8.0.27\"");

    }

    public static void main(String[] args) {

        try {
            switch (args[0]) {
            case "-l":
                con = Connections.getConnection();
                LoadData.loadData(con);
                Connections.disconnect(con);
                break;
            case "-s":
                try {
                    switch (args[1]) {
                    case "all":
                        con = Connections.getConnection();
                        Display.displayAll(con);
                        Connections.disconnect(con);
                        break;
                    case "cat":
                        try {
                            con = Connections.getConnection();
                            Display.displayCatagories(con, args[2]);
                            Connections.disconnect(con);
                        } catch (Exception e) {
                            System.out.println("Please Check Help Command \n type \"-h\"");
                        }
                        break;
                    case "adno":
                        try {
                            con = Connections.getConnection();
                            Display.displayAdNo(con, args[2]);
                            Connections.disconnect(con);
                        } catch (Exception e) {
                            System.out.println("Please Check Help Command \n type \"-h\"");
                        }
                        break;
                    case "cname":
                        try {
                            con = Connections.getConnection();
                            Display.displayCandidateName(con, args[2]);
                            Connections.disconnect(con);
                        } catch (Exception e) {
                            System.out.println("Please Check Help Command \n type \"-h\"");
                        }
                        break;
                    case "age":
                        try {
                            con = Connections.getConnection();
                            Display.displayAge(con, Integer.parseInt(args[2]));
                            Connections.disconnect(con);
                        } catch (Exception e) {
                            System.out.println("Please Check Help Command \n type \"-h\"");
                        }
                        break;
                    default:
                        System.out.println("Please Check Help Command \n type \"-h\"");

                        break;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Please Check Help Command \n type \"-h\"");
                }
                break;
            case "-i":
                try {
                    con = Connections.getConnection();
                    Insert.insertRecord(con, args);
                    Connections.disconnect(con);
                } catch (Exception e) {
                    System.out.println("Please Check Help Command \n type \"-h\"");

                }

                break;
            case "-count":
                try {
                    switch (args[1]) {

                    case "cat":
                        con = Connections.getConnection();
                        CountByCategory catCount=new CountByCategory();
                        catCount.count(con);
                        Connections.disconnect(con);
                        break;
                    case "firstdose":
                        con = Connections.getConnection();
                        CountByFirstDose fdoseCount=new CountByFirstDose();
                        fdoseCount.count(con);
                        Connections.disconnect(con);
                        break;
                    case "seconddose":
                        con = Connections.getConnection();
                        CountBySecondDose sdoseCount=new CountBySecondDose();
                        sdoseCount.count(con);
                        Connections.disconnect(con);
                        break;
                    default:
                        System.out.println("Please Check Help Command \n type \"-h\"");

                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Please Check Help Command \n type \"-h\"");
                }

                break;
            
            case "-u":
                try {
                    switch (args[1]) {

                    case "all":
                        con = Connections.getConnection();

                        Update.updateAll(con, args);
                        Connections.disconnect(con);
                        break;
                    case "adno":
                        con = Connections.getConnection();

                        Update.updateByAadharNo(con, args);
                        Connections.disconnect(con);
                        break;
                    case "fdose":
                        con = Connections.getConnection();

                        Update.updateByFirstDose(con, args);
                        Connections.disconnect(con);
                        break;
                    case "sdose":
                        con = Connections.getConnection();

                        Update.updateBySecondDose(con, args);
                        Connections.disconnect(con);
                        break;
                    default:
                        System.out.println("Please Check Help Command \n type \"-h\"");

                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Please Check Help Command \n type \"-h\"");

                }

                break;
            
                       
                    
                

                
            case "-d":
                try {
                    con = Connections.getConnection();
                    Delete.deleteRecord(con, args);
                    Connections.disconnect(con);
                } catch (Exception e) {
                    System.out.println("Please Check Help Command \n type \"-h\"");
                }

                break;
            case "-h":
                printHelp();
                break;
            case "-v":
                version();
                break;
            default:
                System.out.println("Please Check Help Command \n type \"-h\"");
                break;
            }
        } catch (Exception e) {
            System.out.println("Please Check Help Command \n type \"-h\"");
        }

    }
}