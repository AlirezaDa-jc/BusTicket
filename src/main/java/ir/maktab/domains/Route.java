package ir.maktab.domains;

import ir.maktab.base.domains.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "route")
public class Route extends BaseEntity<Long> {
    @Column(name = "firstcity", nullable = false)
    private String firstCity;
    @Column(name = "secondcity", nullable = false)
    private String secondCity;
    @Column(name = "date", nullable = false)
    private String date;
    @Column(name = "time", nullable = false)
    private String time;
    //    private LocalDate date;
    @OneToMany(mappedBy = "route", orphanRemoval = true)
    private List<Ticket> tickets = new LinkedList<>();

    public Route() {
    }

    public Route(String firstCity, String secondCity, String date) {
        this.firstCity = firstCity;
        this.secondCity = secondCity;
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFirstCity() {
        return firstCity;
    }

    public void setFirstCity(String firstCity) {
        this.firstCity = firstCity;
    }

    public String getSecondCity() {
        return secondCity;
    }

    public void setSecondCity(String secondCity) {
        this.secondCity = secondCity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return firstCity.equals(route.firstCity) &&
                secondCity.equals(route.secondCity) &&
                date.equals(route.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstCity, secondCity, date);
    }


}
