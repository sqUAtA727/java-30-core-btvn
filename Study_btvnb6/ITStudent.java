package lesson6.Study_btvnb6;

public class ITStudent extends TechMasterStudent {
    private double javaScore;
    private double htmlScore;
    private double cssScore;

    public ITStudent(String name, String major, double javaScore, double htmlScore, double cssScore) {
        super(name, major);
        this.javaScore = javaScore;
        this.htmlScore = htmlScore;
        this.cssScore = cssScore;
    }

    public double getJavaScore() {
        return javaScore;
    }

    public void setJavaScore(double javaScore) {
        this.javaScore = javaScore;
    }

    public double getHtmlScore() {
        return htmlScore;
    }

    public void setHtmlScore(double htmlScore) {
        this.htmlScore = htmlScore;
    }

    public double getCssScore() {
        return cssScore;
    }

    public void setCssScore(double cssScore) {
        this.cssScore = cssScore;
    }

    @Override
    public double getScore() {
        return (2 * javaScore + htmlScore + cssScore) / 4;
    }

    @Override
    public String toString() {
        return "ITStudent{" +
                "Ten=" + getName() +
                ", Chuyen nganh=" + getMajor() +
                ", Diem=" + getScore() +
                ", Hoc luc=" + classify() +
                '}';
    }
}
