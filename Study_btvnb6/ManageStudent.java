package lesson6.Study_btvnb6;

public class ManageStudent {
    private ITStudent[] itStudents;
    private BizStudent[] bizStudents;

    public ManageStudent(ITStudent[] itStudents, BizStudent[] bizStudents) {
        this.itStudents = itStudents;
        this.bizStudents = bizStudents;
    }

    public ITStudent[] getItStudents() {
        return itStudents;
    }

    public void setItStudents(ITStudent[] itStudents) {
        this.itStudents = itStudents;
    }

    public BizStudent[] getBizStudents() {
        return bizStudents;
    }

    public void setBizStudents(BizStudent[] bizStudents) {
        this.bizStudents = bizStudents;
    }
}
