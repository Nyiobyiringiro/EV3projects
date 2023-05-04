package data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class linefollower {
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int motorc;
	private int motord;
	private int id;
	
	public String toString() {
		return  id+": "+motorc+" "+motord;
	}
	public linefollower() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public linefollower(int motorc, int motord, int id) {
		super();
		this.id=id;
		this.motorc = motorc;
		this.motord = motord;
	}
	
}
