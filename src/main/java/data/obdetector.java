package data;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class obdetector {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private int id;
 private int distance;
 private Timestamp time;
@Override
public String toString() {
	return "obdetector [id=" + id + ", distance=" + distance + ", time=" + time + "]";
}
public obdetector() {
	super();
	// TODO Auto-generated constructor stub
}
public obdetector(int id, int distance, Timestamp time) {
	super();
	this.id = id;
	this.distance = distance;
	this.time = time;
}
public obdetector(int distance) {
	this.distance=distance;
}
public obdetector(int distance, Timestamp time) {
	// TODO Auto-generated constructor stub
	this.distance = distance;
	this.time = time;
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
public Timestamp getTime() {
	return time;
}
public void setTime(Timestamp time) {
	this.time = time;
}
}
