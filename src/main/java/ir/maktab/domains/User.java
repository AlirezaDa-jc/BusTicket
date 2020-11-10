package ir.maktab.domains;

import ir.maktab.base.domains.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name = "users")
public class User extends BaseEntity<Long> {
    @Column(name = "username", nullable = false, unique = true)
    private String userName;
    @Column(name = "password", nullable = false)
    private String password;
    @OneToMany(mappedBy = "user", orphanRemoval = true)
    private List<Ticket> tickets = new LinkedList<>();

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void removeTicket(Ticket ticket){
        tickets.remove(ticket);
    }
    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
