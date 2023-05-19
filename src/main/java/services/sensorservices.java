package services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
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
	public sensors AddData(@FormParam("id") int id,@FormParam("sec_distance") int sec_distance,@FormParam("linecolor") float linecolor) {
		sensors obj=new sensors(id,sec_distance,linecolor);
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
//		em.persist(obj);
		//updating only one line.
		em.merge(obj);
		em.getTransaction().commit();
		return obj;
	}
	@GET
	@Path("/getsensors")
	@Produces(MediaType.TEXT_PLAIN)
	public  String sec_distance() {
	    // And then EntityManager, which can manage the entities.
	    EntityManager em = emf.createEntityManager();
	    
	    // Retrieve the Prey with the specified ID
	    sensors sensors = em.find(sensors.class,1);
	    
	    // Close the EntityManager and EntityManagerFactory
	    em.close();
	    emf.close();
	    return sensors.toString();
	}
	
	// if you need color alone 
	@GET
	@Path("/getlinecolor")
	@Produces(MediaType.TEXT_PLAIN)
	public  float linecolor() {
		// And then EntityManager, which can manage the entities.
	    EntityManager em = emf.createEntityManager();
	    
	    // Retrieve the Prey with the specified ID
	    sensors motorc = em.find(sensors.class,1);
	    
	    // Close the EntityManager and EntityManagerFactory
	    em.close();
	    emf.close();
	    
	    
	   return motorc.getLinecolor();
	}
}
