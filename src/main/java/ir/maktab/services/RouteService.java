package ir.maktab.services;

import ir.maktab.base.services.BaseService;
import ir.maktab.domains.Route;

import java.util.List;

public interface RouteService  extends BaseService<Route,Long> {
    List<Route> findRoutes(Route route);
}
