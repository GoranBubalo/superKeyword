package superKeyword;
//child class
public class Hero extends Person {
	
	String power;
	
	Hero(String name,int age, String power) {
		//super = refers to superclass (parent)
		super(name,age);
		this.power=power;
	}
	
	
	public String toString() {
		return super.toString() + this.power;
	}
}
