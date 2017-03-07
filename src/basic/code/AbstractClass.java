package basic.code;

abstract class Shape{
	private double width;
	private double height;
	private String name;
	
	Shape() {
		width = height = 0.0;
		name = "null";
	}
	
	Shape(double w, double h, String n){
		width = w;
		height = h;
		name = n;
	}
	
	Shape(double x, String n){
		width = height = x;
		name = n;
	}
	
	Shape(Shape obj){
		width = obj.width;
		height = obj.height;
		name = obj.name;
	}
	
	double getWidth(){
		return width;
	}
	
	double getHeight(){
		return height;
	}
	
	void setWidth(double w){
		width = w;
	}
	
	void setHeight(double h){
		height = h;
	}
	
	String getName(){
		return name;
	}
	
	void show(){
		System.out.println("Width = " + width + " Height = " + height + " style = " + name);
	}
	
	abstract double area();
	
}

class Triangle extends Shape{ //CLASS TRIANGLE
	private String style;
	Triangle(){
		super();
		style = "null";
	}
	
	Triangle(double w, double h, String s){
		super(w ,h , s); //value get from Triangle parameter and pass it to super class constructor parameter 
		style = s;
	}
	
	Triangle(double x){
		super(x, "Triangle");
		style = "isosceles";
	}
	
	Triangle(Triangle obj){
		super(obj);
		style = obj.style;
	}
	
	double area(){
		return getWidth() * getHeight()/2;
	}
	
	void styleShow(){
		System.out.println("Triangle is "+ style);
	}
}

class Rectangle extends Shape{
	Rectangle() {
		super();
	}
	
	Rectangle(double w, double h){
		super(w, h, "Retangle");
	}
	
	Rectangle(double x){
		super(x, "Rectangle");
	}
	
	Rectangle(Rectangle obj){
		super(obj);
	}
	
	double area(){
		return getWidth() * getHeight();
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shapeObj[] = new Shape[4];
		shapeObj[0] = new Triangle(9.0, 11.0, "Right");
		shapeObj[1] = new Rectangle(11);
		shapeObj[2] = new Rectangle(12,5);
		shapeObj[3] = new Triangle(9.8);
		
		for(int i=0; i<4; i++){
			shapeObj[i].show();
		}
	}

}


// i stuck on super()