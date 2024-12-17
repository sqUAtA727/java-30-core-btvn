package lesson9.btvn9.Lab4.entity;

public class Boss extends Worker {
    private double bossExtraSalary;

    public Boss(String name, double salary, double bossExtraSalary) {
        super(name, salary);
        this.bossExtraSalary = bossExtraSalary;
    }

    public double getBossExtraSalary() {
        return bossExtraSalary;
    }

    public void setBossExtraSalary(double bossExtraSalary) {
        this.bossExtraSalary = bossExtraSalary;
    }

    public Double getIncome(){
        return salary+bossExtraSalary;
    }

    public Double getTax(){
        if (getIncome()>=500){
            return getIncome()*10/100;
        } else {
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "Boss{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                "bossExtraSalary=" + bossExtraSalary +
                ", income=" + getIncome() +
                ", tax=" + getTax() +
                '}';
    }
}
