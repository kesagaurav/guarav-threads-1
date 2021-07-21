
public class Mother {

	public String name;
	public String desingation;
	public String color;
	public double weight;
	public Mother() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mother(String name, String desingation, String color, double weight) {
		super();
		this.name = name;
		this.desingation = desingation;
		this.color = color;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesingation() {
		return desingation;
	}
	public void setDesingation(String desingation) {
		this.desingation = desingation;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Mother [name=" + name + ", desingation=" + desingation + ", color=" + color + ", weight=" + weight
				+ "]";
	}
	
	
	
}





class MotherThread extends Thread{
	private Mother m;

	public MotherThread(Mother m) {
		super();
		this.m = m;
	}
	
	public void run() {
		m.getClass();
	}
}