package btvn5.Hospital;

public class Doctor extends Person {
    public String specialization;
    public int workingHours;

    public Doctor() {

    }

    public Doctor(String name, int age, String specializecation, int workingHours) {
        super(name, age);
        this.specialization = specializecation;
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public String getSpecializecation() {
        return specialization;
    }

    public void setSpecializecation(String specializecation) {
        this.specialization = specializecation;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Chuyen khoa: " + specialization);
        System.out.println("So gio lam viec: " + workingHours);
    }
}
