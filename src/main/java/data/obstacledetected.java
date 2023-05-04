package data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class obstacledetected {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int distance;
	
	
	public obstacledetected() {
		super();
		
	}

	public obstacledetected(int id, int distance) {
		this.id=id;
		this.distance=distance;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "obstacledetected [id=" + id + ", distance=" + distance + "]";
	}
	
	
}
