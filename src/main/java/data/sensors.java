package data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class sensors {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int sec_distance;
	private float linecolor;
	
	public sensors() {
		super();
		
	}
	public sensors(int id, int sec_distance, float linecolor) {
		super();
		this.id = id;
		this.sec_distance = sec_distance;
		this.linecolor = linecolor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSec_distance() {
		return sec_distance;
	}
	public void setSec_distance(int sec_distance) {
		this.sec_distance = sec_distance;
	}
	public float getLinecolor() {
		return linecolor;
	}
	public void setLinecolor(float linecolor) {
		this.linecolor = linecolor;
	}
	@Override
	public String toString() {
		return "sensors [id=" + id + ", sec_distance=" + sec_distance + ", linecolor=" + linecolor + "]";
	}
	
	
	
}
