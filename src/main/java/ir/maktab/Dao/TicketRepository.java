package ir.maktab.Dao;

import ir.maktab.base.repository.BaseRepository;
import ir.maktab.domains.Route;
import ir.maktab.domains.Ticket;

import java.util.List;

public interface TicketRepository extends BaseRepository<Ticket,Long> {
    List<Ticket> findByRoute(Route route);
}
