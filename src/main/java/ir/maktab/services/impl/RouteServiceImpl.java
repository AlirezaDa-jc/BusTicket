package ir.maktab.services.impl;

import ir.maktab.Dao.RouteRepository;
import ir.maktab.Dao.impl.RouteRepositoryImpl;
import ir.maktab.base.services.impl.BaseServiceImpl;
import ir.maktab.domains.Route;
import ir.maktab.services.RouteService;

import java.util.List;
import java.util.stream.Collectors;

public class RouteServiceImpl extends BaseServiceImpl<Route, Long, RouteRepository> implements RouteService {
    private static List<Route> routes;
    private static Route route;
    public RouteServiceImpl() {
        RouteRepository repository = new RouteRepositoryImpl();
        super.setRepository(repository);
    }

    public RouteServiceImpl(RouteRepository repository) {
        super(repository);
    }

    public static Route getRoute() {
        return route;
    }

    public static void setRoute(Route route) {
        RouteServiceImpl.route = route;
    }

    public static List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        RouteServiceImpl.routes = routes;
    }

    @Override
    public List<Route> findAll(){
        routes = baseRepository.findAll();
        return routes;
    }

    @Override
    public List<Route> findRoutes(Route route) {
        routes = baseRepository.findAll().stream()
                .filter((c) -> c.equals(route))
                .collect(Collectors.toList());
        if(routes.size() == 0 ){
            routes = null;
        }
        return routes;
    }
}
