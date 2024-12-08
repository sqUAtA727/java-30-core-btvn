package lesson6.Study_btvnb6;

public abstract class TechMasterStudent {
    private String name;
    private String major;

    public TechMasterStudent(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public abstract double getScore();

    public String classify() {
        double score = getScore();
        if (score < 5) {
            return "Yeu";
        } else if (score < 6.5) {
            return "Trung binh";
        } else if (score < 7.5) {
            return "Kha";
        } else {
            return "Gioi";
        }
    }
}
