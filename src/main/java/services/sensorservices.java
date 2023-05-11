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
import data.sensors;
@Path("/robot18services")
public class sensorservices {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("robot18");
	@POST
	@Path("/sensors")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public sensors AddData(@FormParam("id") int id,@FormParam("sec_dictance") int sec_distance,@FormParam("linecolor") int linecolor) {
		sensors obj=new sensors(id,sec_distance,linecolor);
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
		return obj;
	}
	@GET
	@Path("/getsec_distance/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public  int sec_distance(@PathParam("id")int id) {
	    // And then EntityManager, which can manage the entities.
	    EntityManager em = emf.createEntityManager();
	    
	    // Retrieve the Prey with the specified ID
	    sensors motorc = em.find(sensors.class,id);
	    
	    // Close the EntityManager and EntityManagerFactory
	    em.close();
	    emf.close();
	    
	    
	   return motorc.getSec_distance();
	}
	@GET
	@Path("/getlinecolor/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public  float linecolor(@PathParam("id")int id) {
		// And then EntityManager, which can manage the entities.
	    EntityManager em = emf.createEntityManager();
	    
	    // Retrieve the Prey with the specified ID
	    sensors motorc = em.find(sensors.class,id);
	    
	    // Close the EntityManager and EntityManagerFactory
	    em.close();
	    emf.close();
	    
	    
	   return motorc.getLinecolor();
	}
}
