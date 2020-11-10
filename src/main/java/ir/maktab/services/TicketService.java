package ir.maktab.services;

import ir.maktab.base.services.BaseService;
import ir.maktab.domains.Route;
import ir.maktab.domains.Ticket;

import java.util.List;

public interface TicketService extends BaseService<Ticket , Long> {
    List<Ticket> findByRoute(Route route);
}
