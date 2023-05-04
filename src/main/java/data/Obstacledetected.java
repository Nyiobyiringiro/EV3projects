package data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Obstacledetected {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	public int motorc;
	public int motord;
	public int delay;
	public int cycle;
	
	public Obstacledetected(int distance, int motorc, int motord, int delay, int cycle) {
		super();
		
		this.motorc = motorc;
		this.motord = motord;
		this.delay = delay;
		this.cycle = cycle;
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
	public int getDelay() {
		return delay;
	}
	public void setDelay(int delay) {
		this.delay = delay;
	}
	public int getCycle() {
		return cycle;
	}
	public void setCycle(int cycle) {
		this.cycle = cycle;
	}
}
