package ir.maktab.Dao.impl;

import ir.maktab.Dao.TicketRepository;
import ir.maktab.base.repository.impl.BaseRepositoryImpl;
import ir.maktab.domains.Route;
import ir.maktab.domains.Ticket;

import javax.persistence.TypedQuery;
import java.util.List;

public class TicketRepositoryImpl  extends BaseRepositoryImpl<Ticket,Long> implements TicketRepository {
    @Override
    protected Class<Ticket> getEntityClass() {
        return Ticket.class;
    }

    @Override
    public List<Ticket> findByRoute(Route route) {
        em.getTransaction().begin();
        TypedQuery<Ticket> query = em.createQuery(
                "SELECT u FROM Ticket u where u.route=:route",
                Ticket.class);

        query.setParameter("route", route);
        List<Ticket> resultList = query.getResultList();
        em.getTransaction().commit();
        if (resultList.size() > 0) {
            return resultList;
        }
        return null;
    }
}
