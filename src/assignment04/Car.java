package assignment04;

public class Car {
	int year;
	String make;
	double speed;
	
	public Car(int year,String maker,double speed) {
		this.year=year;
		this.make=make;
		this.speed =speed;
	}
	
	public int getYear() {
		return year;
	}
	public String getMake() {
		return make;
	}
	public double getSpeed() {
		return speed;
	}
}
