package ir.maktab.services.impl;

import ir.maktab.Dao.TicketRepository;
import ir.maktab.Dao.impl.TicketRepositoryImpl;
import ir.maktab.base.services.impl.BaseServiceImpl;
import ir.maktab.domains.Route;
import ir.maktab.domains.Ticket;
import ir.maktab.services.TicketService;

import java.util.List;

public class TicketServiceImpl extends BaseServiceImpl<Ticket,Long,TicketRepository> implements TicketService {
    public TicketServiceImpl() {
        TicketRepository repository = new TicketRepositoryImpl();
        super.setRepository(repository);
    }

    public TicketServiceImpl(TicketRepository repository) {
        super(repository);
    }

    @Override
    public List<Ticket> findByRoute(Route route) {
        return baseRepository.findByRoute(route);
    }
}
