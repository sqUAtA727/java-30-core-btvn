package lesson9.btvn9.Lab4.entity;

public class MarketingWorker extends Worker {
    private int salesVolume;
    private double bonusRate;

    public MarketingWorker(String name, double salary, int salesVolume, double bonusRate) {
        super(name, salary);
        this.salesVolume = salesVolume;
        this.bonusRate = bonusRate;
    }

    public int getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(int salesVolume) {
        this.salesVolume = salesVolume;
    }

    public double getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    public Double getIncome(){
        return salary+salary*bonusRate;
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
        return "MarketingWorker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                "salesVolume=" + salesVolume +
                ", bonusRate=" + bonusRate +
                ", income=" + getIncome() +
                ", tax=" + getTax() +
                '}';
    }
}
