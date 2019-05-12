package by.bsac.Actor;

import java.sql.Date;

public class Actor {
    private String name;
    private Date date;

    public Actor(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return name + " " + date.toString();
    }
}
