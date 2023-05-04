package data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sensors {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int sec_distance;
	public int linecolor;
	
	public Sensors(int sec_distance, int linecolor) {
		super();
		this.sec_distance = sec_distance;
		this.linecolor = linecolor;
	}
	public int getSec_distance() {
		return sec_distance;
	}
	public void setSec_distance(int sec_distance) {
		this.sec_distance = sec_distance;
	}
	public int getLinecolor() {
		return linecolor;
	}
	public void setLinecolor(int linecolor) {
		this.linecolor = linecolor;
	}
	
}
