package data;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class codetector {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String color;
	private Timestamp time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "codetector [id=" + id + ", color=" + color + ", time=" + time + "]";
	}
	public codetector(int id, String color, Timestamp time) {
		super();
		this.id = id;
		this.color = color;
		this.time = time;
	}
	public codetector() {
		super();
		// TODO Auto-generated constructor stub
	}
}
