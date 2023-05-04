package service;
import data.linefollower;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/robot18services")
public class robot18services {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("robot18");

	@POST
	@Path("/linefollower")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public linefollower NewData(@FormParam("motorc") int motorc, @FormParam("motord") int motord) {
		linefollower linefollower=new linefollower(motorc, motord);
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(linefollower);
		em.getTransaction().commit();
		return linefollower;
		//@FormParam("id") int id,
	}
	

//	@POST
//	@Path("/obstacledetected")
//	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<obstacledetected> addData(obstacledetected obstacledetected) {
//		EntityManager em=emf.createEntityManager();
//		em.getTransaction().begin();
//		em.persist(obstacledetected);
//		em.getTransaction().commit();
//		List<obstacledetected> list=readobstacledetected();		
//		return list;
//	}
//
//	private List<obstacledetected> readobstacledetected() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@POST
//	@Path("/sensors")
//	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Sensors> addData(Sensors sensors) {
//		EntityManager em=emf.createEntityManager();
//		em.getTransaction().begin();
//		em.persist(sensors);//The actual insertion line
//		em.getTransaction().commit();
//		List<Sensors> list=readSensors();		
//		return list;
//	}
//
//	private List<Sensors> readSensors() {
//		// TODO Auto-generated method stub
//		return null;
//	}	
//


}
