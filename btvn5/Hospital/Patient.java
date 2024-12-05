package btvn5.Hospital;

public class Patient extends Person {
    public int caseNum;
    public String dateJoin;

    public Patient() {

    }

    public Patient(String name, int age, int caseNum, String dateJoin) {
        super(name, age);
        this.caseNum = caseNum;
        this.dateJoin = dateJoin;
    }

    public int getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(int caseNum) {
        this.caseNum = caseNum;
    }

    public String getDateJoin() {
        return dateJoin;
    }

    public void setDateJoin(String dateJoin) {
        this.dateJoin = dateJoin;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("So benh an: " + caseNum);
        System.out.println("Ngay nhap vien: " + dateJoin);
    }
}
