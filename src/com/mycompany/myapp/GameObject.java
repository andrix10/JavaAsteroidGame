package com.mycompany.myapp;

public class GameObject {
	private double[] location;
	
	public void GameObject() {
		location = new double[2];
	}
	
	public void setLoc(float x, float y)
	{
		location[0] = x;
		location[y] = y;
	}
	
	public double getX() {
		return location[0];
	}
	
	public double getY() {
		return location[1];
	}
}