package ir.maktab.Dao.impl;

import ir.maktab.Dao.RouteRepository;
import ir.maktab.base.repository.impl.BaseRepositoryImpl;
import ir.maktab.domains.Route;

public class RouteRepositoryImpl extends BaseRepositoryImpl<Route,Long> implements RouteRepository {
    @Override
    protected Class<Route> getEntityClass() {
        return Route.class;
    }

}
