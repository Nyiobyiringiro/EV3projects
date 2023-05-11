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
import data.obstacledetected;

@Path("/robot18services")
public class obstacleservices {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("robot18");
	@POST
	@Path("/obstacledetected")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public obstacledetected Newinfo(@FormParam("id") int id,@FormParam("distance") int distance) {
		obstacledetected obj=new obstacledetected(id,distance);
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
		return obj;
	}
	@GET
	@Path("/getdistance/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public  int distance(@PathParam("id")int id) {
	    // And then EntityManager, which can manage the entities.
	    EntityManager em = emf.createEntityManager();
	    
	    // Retrieve the Prey with the specified ID
	    obstacledetected motorc = em.find(obstacledetected.class,id);
	    
	    // Close the EntityManager and EntityManagerFactory
	    em.close();
	    emf.close();
	    
	    
	   return motorc.getDistance();
	}
}
