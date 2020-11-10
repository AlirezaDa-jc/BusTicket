package ir.maktab.domains;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Ticket.class)
public abstract class Ticket_ extends ir.maktab.base.domains.BaseEntity_ {

	public static volatile SingularAttribute<Ticket, Route> route;
	public static volatile SingularAttribute<Ticket, String> gender;
	public static volatile SingularAttribute<Ticket, String> name;
	public static volatile SingularAttribute<Ticket, User> user;

}

