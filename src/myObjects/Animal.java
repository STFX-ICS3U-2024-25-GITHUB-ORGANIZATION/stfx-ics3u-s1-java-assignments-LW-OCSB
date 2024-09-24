package myObjects;

public class Animal {

	// data members
	private String color;
	private String habitat;
	private int age;
	
	// default constructor
	public Animal()  {
		
		this.color = "";
		this.habitat = "";
		this.age = 0;
	}
	
	// parameterized constructor
	public Animal(String c, String h, int a)  {
		
		this.color = c;
		this.habitat = h;
		this.age = a;
	}
	
	
	
	// get methods (getters)
	public String getColor() {
		
		return this.color;	
	}
	
	public String getHabitat() {
		
		return this.habitat;	
	}
	
	public int getAge() {
		
		return this.age;	
	}

	
	// set methods (setters)
	public void setColor(String c)  {
		
		this.color = c;
	}
	
	public void setHabitat(String h)  {
		
		this.habitat = h;
	}

	public void setAge(int a)  {
	
		this.age = a;
	}

	// .toString
	public String toString()  {
		
		return "Hello World!";
	}
	
	
}
