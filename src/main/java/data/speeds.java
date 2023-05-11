package data;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class speeds {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int motorc;
	private int motord;
	private Timestamp time;
	@Override
	public String toString() {
		return "speeds [id=" + id + ", motorc=" + motorc + ", motord=" + motord + ", time=" + time + "]";
	}
	public speeds() {
		super();
		// TODO Auto-generated constructor stub
	}
	public speeds(int id, int motorc, int motord, Timestamp time) {
		super();
		this.id = id;
		this.motorc = motorc;
		this.motord = motord;
		this.time = time;
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
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
}
