package ir.maktab.domains;

import ir.maktab.base.domains.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket extends BaseEntity<Long> {

    private String name;
    private String gender;

    @ManyToOne
    @JoinColumn(name = "routeid")
    private Route route;

    @ManyToOne
    @JoinColumn(name = "userid")
    private User user;

    public Ticket() {
    }

    public Ticket(String name, String gender, Route route) {
        this.name = name;
        this.gender = gender;
        this.route = route;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
