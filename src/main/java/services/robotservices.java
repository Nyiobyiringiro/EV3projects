package services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import data.linefollower;
import data.obstacledetected;

@Path("/robot18services")
public class robotservices {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("robot18");

	@POST
	@Path("/linefollower")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public linefollower NewData(@FormParam("motorc") int motorc, @FormParam("motord") int motord,@FormParam("id") int id) {
		linefollower obj=new linefollower(motorc, motord, id);
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
		return obj;
	}

	@POST
	@Path("/obstacledetected")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public obstacledetected NewData(@FormParam("id") int id,@FormParam("distance") int distance) {
		obstacledetected obj=new obstacledetected(id,distance);
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
		return obj;
	}

}
