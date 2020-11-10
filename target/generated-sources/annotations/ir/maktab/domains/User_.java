package ir.maktab.domains;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ extends ir.maktab.base.domains.BaseEntity_ {

	public static volatile SingularAttribute<User, String> password;
	public static volatile ListAttribute<User, Ticket> tickets;
	public static volatile SingularAttribute<User, String> userName;

}

