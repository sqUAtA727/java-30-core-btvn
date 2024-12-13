package lesson8.btvn8.Techmaster.entity;

public class Techmaster {
    private String classManager;
    private String teacher;
    private Classroom classroom;

    public Techmaster(String classManager, String teacher, Classroom Classroom) {
        this.classManager = classManager;
        this.teacher = teacher;
        this.classroom = Classroom;
    }

    public String getClassManager() {
        return classManager;
    }

    public void setClassManager(String classManager) {
        this.classManager = classManager;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Classroom getaClass() {
        return classroom;
    }

    public void setaClass(Classroom aClassroom) {
        this.classroom = aClassroom;
    }

    @Override
    public String toString() {
        return "Techmaster{" +
                "classManager='" + classManager + '\'' +
                ", teacher='" + teacher + '\'' +
                ", aClass=" + classroom +
                '}';
    }
}
