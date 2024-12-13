package lesson8.btvn8.Family.entity;

import java.util.ArrayList;

public class Family {
    private int id;
    private int numberHouse;
    private ArrayList<Member> members;

    public Family(int id, int numberHouse, ArrayList<Member> members) {
        this.id = id;
        this.numberHouse = numberHouse;
        this.members = members;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Family{" +
                "id=" + id +
                ", numberHouse=" + numberHouse +
                ", members=" + members +
                '}';
    }
}