package services;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import data.*;

@Path("/statistics")
public class Statistics {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("robot18");
	
	@GET
	@Path("/addobstacle/{id}/{distance}")
	@Produces(MediaType.APPLICATION_JSON)
	public obdetector getDistance(@PathParam("distance") int distance,@PathParam("id") int id) {
		//set time to the current time and date
		Date currentDate = new Date();
	    Timestamp time = new Timestamp(currentDate.getTime());
	    //newObstacle.setTime(time);
		
	    obdetector newObstacle=new obdetector(id,distance,time);
	    EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(newObstacle);
		em.getTransaction().commit();
		return newObstacle;
	}
	
	//sending the value of the color from the robot to the database
	@GET
	@Path("/getcolor/{id}/{decolor}")
	@Produces(MediaType.APPLICATION_JSON)
	public codetector getColor(@PathParam("decolor") float decolor,@PathParam("id") int id) {
		//set time to the current time and date
		Date currentDate = new Date();
	    Timestamp time = new Timestamp(currentDate.getTime());
	    //newObstacle.setTime(time);
	    String color;
		if(decolor>=0.5) {
			color="black";
			 codetector newObstacle=new codetector(id,color,time);
			    EntityManager em=emf.createEntityManager();
				em.getTransaction().begin();
				em.persist(newObstacle);
				em.getTransaction().commit();
				return newObstacle;
		} 
		else {
			color="White";
			 codetector newObstacle=new codetector(id,color,time);
			    EntityManager em=emf.createEntityManager();
				em.getTransaction().begin();
				em.persist(newObstacle);
				em.getTransaction().commit();
				return newObstacle;
		}
		
	   
	
	}
//	@GET
//	@Path("/addobstacle/{id}/{distance}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public obdetector getDistance(@PathParam("distance") int distance,@PathParam("id") int id) {
//		//set time to the current time and date
//		Date currentDate = new Date();
//	    Timestamp time = new Timestamp(currentDate.getTime());
//	    //newObstacle.setTime(time);
//		
//	    obdetector newObstacle=new obdetector(id,distance,time);
//	    EntityManager em=emf.createEntityManager();
//		em.getTransaction().begin();
//		em.persist(newObstacle);
//		em.getTransaction().commit();
//		return newObstacle;
//	}
}
