
public class Gaurav2 {

	public String name;
	public String mname;
	public String fname;
	
	
	
	
	public Gaurav2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gaurav2(String name, String mname, String fname) {
		super();
		this.name = name;
		this.mname = mname;
		this.fname = fname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	@Override
	public String toString() {
		return "Gaurav2 [name=" + name + ", mname=" + mname + ", fname=" + fname + "]";
	}
	
	
	
	
}



class G3 extends Thread{
	
	private Gaurav2 g;

	public G3(Gaurav2 g1) {
		this.g = g1;
	}
	
	public void run() {
		g.getClass();
	}
	
}
