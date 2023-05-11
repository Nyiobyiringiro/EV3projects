package services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import data.linefollower;
@Path("/robot18services")
public class linefollowerservices {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("robot18");

	@POST
	@Path("/linefollower")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public linefollower NewData(@FormParam("id") int id, @FormParam("motorc") int motorc, @FormParam("motord") int motord) {
		linefollower obj=new linefollower(id, motorc, motord);
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
		return obj;
	}
	@GET
	@Path("/getmotorc/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public  int motorc(@PathParam("id")int id) {
	    // And then EntityManager, which can manage the entities.
	    EntityManager em = emf.createEntityManager();
	    
	    // Retrieve the Prey with the specified ID
	    linefollower motorc = em.find(linefollower.class,id);
	    
	    // Close the EntityManager and EntityManagerFactory
	    em.close();
	    emf.close();
	    
	    
	   return motorc.getMotorc();
	}
	@GET
	@Path("/getmotord/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public  int motord(@PathParam("id")int id) {
		// And then EntityManager, which can manage the entities.
	    EntityManager em = emf.createEntityManager();
	    
	    // Retrieve the Prey with the specified ID
	    linefollower motorc = em.find(linefollower.class,id);
	    
	    // Close the EntityManager and EntityManagerFactory
	    em.close();
	    emf.close();
	    
	    
	   return motorc.getMotord();
	}
}
