package elements;

import utils.Point3D;

public class Fruit {
	private double value;
	private int type;
	private Point3D pos;
	
	
	//***************************constructors******************************
	public Fruit(double v, int t, Point3D p) {
		value = v;
		type = t;
		pos =p;
	}
	
	
public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Point3D getPos() {
		return pos;
	}
	public void setPos(Point3D pos) {
		this.pos = pos;
	}

}
