package lesson6.Study_btvnb6;

public class BizStudent extends TechMasterStudent {
    private double markettingScore;
    private double salesScore;

    public BizStudent(String name, String major, double salesScore, double markettingScore) {
        super(name, major);
        this.salesScore = salesScore;
        this.markettingScore = markettingScore;
    }

    public double getMarkettingScore() {
        return markettingScore;
    }

    public void setMarkettingScore(double markettingScore) {
        this.markettingScore = markettingScore;
    }

    public double getSalesScore() {
        return salesScore;
    }

    public void setSalesScore(double salesScore) {
        this.salesScore = salesScore;
    }

    @Override
    public double getScore() {
        return (2*markettingScore + salesScore)/3
                ;
    }

    @Override
    public String toString() {
        return "BizStudent{" +
                "Ten=" + getName() +
                ", Chuyen nganh=" + getMajor() +
                ", Diem=" + getScore() +
                ", Hoc luc=" + classify() +
                '}';
    }
}
