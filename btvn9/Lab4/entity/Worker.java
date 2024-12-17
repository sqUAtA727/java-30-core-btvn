package lesson9.btvn9.Lab4.entity;

public class Worker {
    private static int autoId;
    public int id;
    public  String name;
    public  double salary;

    public Worker(String name, double salary) {
        this.id = ++autoId;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Double getTax(){
        if (salary>=500){
            return salary*10/100;
        } else {
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
