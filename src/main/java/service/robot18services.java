package service;
import data.Linefollower;
import data.Obstacledetected;
import data.Sensors;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/robot18services")
public class robot18services {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("robot18");
	@POST
	@Path("/linefollower")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Linefollower> addData(Linefollower linefollower) {
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(linefollower);//The actual insertion line
		em.getTransaction().commit();
		List<Linefollower> list=readlinefollower();		
		return list;
	}

	private List<Linefollower> readlinefollower() {
		// TODO Auto-generated method stub
		return null;
	}	
	
	@POST
	@Path("/obstacledetected")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Obstacledetected> addData(Obstacledetected obstacledetected) {
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(obstacledetected);
		em.getTransaction().commit();
		List<Obstacledetected> list=readObstacledetected();		
		return list;
	}

	private List<Obstacledetected> readObstacledetected() {
		// TODO Auto-generated method stub
		return null;
	}
	@POST
	@Path("/sensors")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Sensors> addData(Sensors sensors) {
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(sensors);//The actual insertion line
		em.getTransaction().commit();
		List<Sensors> list=readSensors();		
		return list;
	}

	private List<Sensors> readSensors() {
		// TODO Auto-generated method stub
		return null;
	}	



}
