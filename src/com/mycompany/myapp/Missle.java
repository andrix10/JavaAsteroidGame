package com.mycompany.myapp;

public class Missle extends Moveable{
	private int fuel;
	
	public Missle(Ship s) {
		setLoc(s.getLocation());
		if(s.getSpeed()>0) setSpeed(s.getSpeed()*2);
		else setSpeed(2);
		setDir(s.getDirection());
		fuel = 10;
		setColor(0);
	}
	
	public void dec() {
		fuel -= 1;
	}
	
	public int getFuel() {
		return fuel;
	}
	
	public void changeColor(int a) {
		setColor(a);
	}
	
	@Override
	public String toString() {
		String parentDesc = "Missle: " + super.toString();
		String myDesc = "fuel: " + getFuel() +" ";
		return parentDesc + myDesc;
	}
}
