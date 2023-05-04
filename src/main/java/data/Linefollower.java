package data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Linefollower {
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int motorc;
	public int motord;
	public int getMotorc() {
		return motorc;
	}
	public void setMotorc(int motorc) {
		this.motorc = motorc;
	}
	public int getMotord() {
		return motord;
	}
	public void setMotord(int motord) {
		this.motord = motord;
	}
	public Linefollower(int motorc, int motord) {
		super();
		this.motorc = motorc;
		this.motord = motord;
	}
	
}
