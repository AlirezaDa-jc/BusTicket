package ir.maktab.domains;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Route.class)
public abstract class Route_ extends ir.maktab.base.domains.BaseEntity_ {

	public static volatile SingularAttribute<Route, String> date;
	public static volatile ListAttribute<Route, Ticket> tickets;
	public static volatile SingularAttribute<Route, String> secondCity;
	public static volatile SingularAttribute<Route, String> time;
	public static volatile SingularAttribute<Route, String> firstCity;

}

