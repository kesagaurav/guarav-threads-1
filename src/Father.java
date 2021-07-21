
public class Father {

	private String name;
	private String businness;
	private double amount;
	private Gaurav2 g1;
	private Mother m;
	public Father() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Father(String name, String businness, double amount,Gaurav2 g1,Mother m) {
		super();
		this.name = name;
		this.businness = businness;
		this.amount = amount;
		this.g1=g1;
		this.m=m;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBusinness() {
		return businness;
	}
	public void setBusinness(String businness) {
		this.businness = businness;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Gaurav2 getG1() {
		return g1;
	}
	public void setG1(Gaurav2 g1) {
		this.g1 = g1;
	}
	public Mother getM() {
		return m;
	}
	public void setM(Mother m) {
		this.m = m;
	}
	@Override
	public String toString() {
		return "Father [name=" + name + ", businness=" + businness + ", amount=" + amount + ", g1=" + g1 + ", m=" + m
				+ "]";
	}
	
	
	
	
	
}
	
	
	
	




class FatherThread extends Thread{
	private Father f;

	public FatherThread(Father f) {
		super();
		this.f = f;
	}
	
	public void run() {
		f.getClass();
	}
}
