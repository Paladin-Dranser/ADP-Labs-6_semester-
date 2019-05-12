package by.bsac.movie;

import java.sql.Date;

public class Movie {
    private String name;
    private Date date;
    private String country;

    public Movie(String name, Date date, String country) {
        this.name = name;
        this.date = date;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", country='" + country + '\'' +
                '}';
    }
}
