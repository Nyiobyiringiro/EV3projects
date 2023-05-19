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
import data.functions;


@Path("/robot18services")
public class functionservices {
   
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("robot18");
	@POST
	@Path("/functions")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public functions AddData(@FormParam("id") int id,@FormParam("motorc") int motorc,@FormParam("motord") int motord,@FormParam("linecolor") float linecolor,
			@FormParam("sec_distance") int sec_distance) {
		functions obj=new functions(id,motorc, motord,linecolor,sec_distance);
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		//updating only one line.
		em.merge(obj);
		em.getTransaction().commit();
		return obj;
	}
	
	@GET
	@Path("/getfunctions")
	@Produces(MediaType.TEXT_PLAIN)
	public  String sec_distance() {
	    // And then EntityManager, which can manage the entities.
	    EntityManager em = emf.createEntityManager();
	    
	    // Retrieve the Prey with the specified ID
	    functions functions = em.find(functions.class,1);
	    
	    // Close the EntityManager and EntityManagerFactory
	    em.close();
	    emf.close();
	    return functions.toString();
	}
}
