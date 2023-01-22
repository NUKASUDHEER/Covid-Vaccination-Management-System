package CRUD;

/**
 * DisplayStuff
 */
public class DisplayStuff {
    private String Aadhar_No;
    private String Candidate_Name;
    private String Category;
    private String Dose_No;
    private int Age;
    public DisplayStuff(String aadhar_No, String candidate_Name, String category, String dose_No, int age) {
        Aadhar_No = aadhar_No;
        Candidate_Name = candidate_Name;
        Category = category;
        Dose_No = dose_No;
        Age = age;
    }
    public String getAadhar_No() {
        return Aadhar_No;
    }
    public void setAadhar_No(String aadhar_No) {
        Aadhar_No = aadhar_No;
    }
    public String getCandidate_Name() {
        return Candidate_Name;
    }
    public void setCandidate_Name(String candidate_Name) {
        Candidate_Name = candidate_Name;
    }
    public String getCategory() {
        return Category;
    }
    public void setCategory(String category) {
        Category = category;
    }
    public String getDose_No() {
        return Dose_No;
    }
    public void setDose_No(String dose_No) {
        Dose_No = dose_No;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }

    
}