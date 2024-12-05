package btvn5.Hospital;

public class Person {
    public String name;
    public int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Tuoi khong hop le");
        System.exit(1);
    }

    public void displayInfo() {
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);

    }
}
