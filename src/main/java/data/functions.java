package data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class functions {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
    private int motorc;
    private int motord;
	private float linecolor;
	 private int sec_distance;
	public functions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public functions(int id, int motorc, int motord, float linecolor, int sec_distance) {
		super();
		this.id = id;
		this.motorc = motorc;
		this.motord = motord;
		this.linecolor = linecolor;
        this.sec_distance = sec_distance;
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
	
	public float getLinecolor() {
		return linecolor;
	}
	public void setLinecolor(float linecolor) {
		this.linecolor = linecolor;
	}
	public int getSec_distance() {
		return sec_distance;
	}
	public void setSec_distance(int sec_distance) {
		this.sec_distance = sec_distance;
	}
	@Override
	public String toString() {
//		return "functions [id=" + id + ", motorc=" + motorc + ", motord=" + motord + ", linecolor=" + linecolor
//				+ ", sec_distance=" + sec_distance + "]";
		return this.motorc + " " + this.motord  + " " + this.linecolor + " " + this.sec_distance;
	}
	
}
