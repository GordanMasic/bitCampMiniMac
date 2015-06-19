package ba.bitcamp.circle;

import ba.bitcamp.treniranje.klasa.Point;

public class Circle {

	private Point center;
	private double radius;
	
	//Constructor of circle
	public Circle(Point c, double radius){
		this.center = c;
		this.radius = radius;
	}
	
	//Getters and Setters
	public Point getCenter(){
		return center;
	}
	
	public void setCenter(Point c){
		this.center = c;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double r){
		this.radius = r;
	}
	
	//toString method
	public String toString(){
		String output = String.format("Center: %s \nRadius: %f", center,radius);
		return output;
	}
	
	//equals method
	public boolean equals(Circle other){
		if(this.center.equals(other.center) && this.radius == other.radius){
			return true;
		}else{
			return false;
		}
	}
	
	//Intersection method
	public boolean doesIntersect(Circle other){
		double sumOfRadius = this.radius + other.radius;
		if(sumOfRadius > this.center.distance(other.center)){
			return true;
		}else{
			return false;
		}
	}
}
